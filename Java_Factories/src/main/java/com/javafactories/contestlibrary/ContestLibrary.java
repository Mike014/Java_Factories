package com.javafactories.contestlibrary;
import java.util.Arrays;

public class ContestLibrary {

    // =========================================================================
    // 1. SLIMS ON A LINE
    //
    // Problem : given array a[], find the minimum number of ±1 operations
    //           needed to make every element equal.
    //
    // Algorithm: the optimal meeting point x is the integer midpoint between
    //            the array's min and max.  Every element must travel at most
    //            max(x − min, max − x) steps, which is also the answer.
    //
    // Complexity: Time O(n)  |  Space O(1)
    // =========================================================================

    /**
     * Returns the minimum number of increment/decrement operations required
     * to make all elements of {@code a} equal.
     *
     * <p>The optimal target is the midpoint x = min + (max − min) / 2.
     * The answer is max(x − min, max − x).</p>
     *
     * @param a input array (may be null or empty → returns 0)
     * @return minimum total operations
     */
    public static int minOperationsToEqualize(int[] a) {
        if (a == null || a.length == 0) return 0;

        int min = a[0], max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) min = a[i];
            if (a[i] > max) max = a[i];
        }

        int x = min + (max - min) / 2;
        return Math.max(x - min, max - x);
    }

    // =========================================================================
    // 2. LIMIT OCCURRENCES
    //
    // Problem : given a SORTED array, remove elements so that each distinct
    //           value appears at most k times.
    //
    // Algorithm: two-pointer (read / write) in-place scan.
    //            The write cursor advances only when nums[read] differs from
    //            nums[write − k], meaning fewer than k copies of the current
    //            value have been written so far.
    //
    // Complexity: Time O(n)  |  Space O(n) for the returned trimmed copy
    //             (the scan itself is O(1) extra space)
    // =========================================================================

    /**
     * Returns a new array in which every distinct value from the sorted input
     * appears at most {@code k} times, preserving order.
     *
     * <p>Precondition: {@code nums} must be sorted in non-decreasing order.</p>
     *
     * @param nums sorted input array
     * @param k    maximum allowed occurrences per distinct value (k ≥ 1)
     * @return trimmed array with occurrences capped at k
     */
    public static int[] limitOccurrences(int[] nums, int k) {
        if (nums.length <= k) return nums;

        int write = k;
        for (int read = k; read < nums.length; read++) {
            if (nums[read] != nums[write - k]) {
                nums[write++] = nums[read];
            }
        }

        return Arrays.copyOfRange(nums, 0, write);
    }

    // =========================================================================
    // 3. FIND CLOSEST NUMBER TO ZERO
    //
    // Problem : find the element in the array whose absolute value is smallest.
    //           On a tie between −x and +x, return +x (the positive one).
    //
    // Algorithm: single linear scan maintaining the current best; update when
    //            |candidate| < |best|, or |candidate| == |best| and candidate > best.
    //
    // Complexity: Time O(n)  |  Space O(1)
    // =========================================================================

    /**
     * Returns the number in {@code nums} closest to zero.
     * When two values are equidistant from zero, the positive one is returned.
     *
     * @param nums non-null, non-empty array
     * @return element with minimum absolute value (positive preferred on tie)
     */
    public static int findClosestToZero(int[] nums) {
        int closest = nums[0];
        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest))
                closest = num;
            else if (Math.abs(num) == Math.abs(closest) && num > closest)
                closest = num;
        }
        return closest;
    }

    // =========================================================================
    // 4. ARRAY STACK  — generic, fixed-capacity, LIFO
    //
    // Backed by a plain Object array; the top pointer starts at −1 (empty).
    //
    // Operations  Complexity
    //   push        O(1)
    //   pop         O(1)
    //   peek        O(1)
    //   isEmpty     O(1)
    //   isFull      O(1)
    // =========================================================================

    /**
     * Generic fixed-capacity LIFO stack backed by an array.
     *
     * <ul>
     *   <li>{@link #push}   — places element on top; prints "Stack Overflow" when full</li>
     *   <li>{@link #pop}    — removes and returns the top element; throws {@link IllegalStateException} on underflow</li>
     *   <li>{@link #peek}   — inspects the top element without removing it; throws if empty</li>
     *   <li>{@link #isEmpty} / {@link #isFull} — O(1) state checks</li>
     * </ul>
     *
     * @param <T> element type
     */
    @SuppressWarnings("unchecked")
    public static class ArrayStack<T> {
        private final T[] data;
        private int top;
        private final int maxSize;

        /**
         * Creates a stack with the given maximum capacity.
         *
         * @param maxSize maximum number of elements the stack can hold
         */
        public ArrayStack(int maxSize) {
            this.maxSize = maxSize;
            this.data    = (T[]) new Object[maxSize];
            this.top     = -1;
        }

        /** Returns true if the stack has no free slots. */
        public boolean isFull()  { return top == maxSize - 1; }

        /** Returns true if the stack contains no elements. */
        public boolean isEmpty() { return top == -1; }

        /**
         * Pushes {@code element} onto the top of the stack.
         * Prints "Stack Overflow" and returns without modifying state if full.
         */
        public void push(T element) {
            if (isFull()) { System.out.println("Stack Overflow"); return; }
            data[++top] = element;
        }

        /**
         * Removes and returns the top element.
         *
         * @throws IllegalStateException if the stack is empty
         */
        public T pop() {
            if (isEmpty()) throw new IllegalStateException("Stack Underflow");
            return data[top--];
        }

        /**
         * Returns the top element without removing it.
         *
         * @throws IllegalStateException if the stack is empty
         */
        public T peek() {
            if (isEmpty()) throw new IllegalStateException("Stack is Empty");
            return data[top];
        }
    }

    // =========================================================================
    // 5. ARRAY QUEUE  — generic, fixed-capacity, FIFO  (linear, non-circular)
    //
    // Backed by a plain Object array; front and rear start at −1 (empty).
    //
    // Operations  Complexity
    //   enqueue     O(1)
    //   dequeue     O(1)
    //   peek        O(1)
    //   isEmpty     O(1)
    //   isFull      O(1)
    //
    // Limitation: this is a LINEAR queue.  Once rear reaches maxSize − 1 the
    //             queue is considered full even if earlier slots were dequeued.
    //             For a reusable queue without this limitation use a circular-
    //             buffer variant instead.
    // =========================================================================

    /**
     * Generic fixed-capacity FIFO queue backed by a linear array.
     *
     * <ul>
     *   <li>{@link #enqueue} — adds element at the rear; prints "Queue Overflow" when full</li>
     *   <li>{@link #dequeue} — removes and returns the front element; throws {@link IllegalStateException} on underflow</li>
     *   <li>{@link #peek}    — inspects the front element without removing it; throws if empty</li>
     *   <li>{@link #isEmpty} / {@link #isFull} — O(1) state checks</li>
     * </ul>
     *
     * <p><b>Note:</b> this is a non-circular (linear) queue.  Once {@code rear}
     * reaches capacity no further enqueues succeed, even if elements have been
     * dequeued from the front.</p>
     *
     * @param <T> element type
     */
    @SuppressWarnings("unchecked")
    public static class ArrayQueue<T> {
        private final T[] data;
        private int front;
        private int rear;
        private final int maxSize;

        public ArrayQueue(int maxSize) {
            this.maxSize = maxSize;
            this.data    = (T[]) new Object[maxSize];
            this.front   = -1;
            this.rear    = -1;
        }

        public boolean isFull()  { return rear == maxSize - 1; }

        public boolean isEmpty() { return front == -1 && rear == -1; }

        public void enqueue(T element) {
            if (isFull()) { System.out.println("Queue Overflow"); return; }
            if (isEmpty()) front = 0;
            data[++rear] = element;
        }

        public T dequeue() {
            if (isEmpty()) throw new IllegalStateException("Queue Underflow");
            T value = data[front];
            if (front == rear) { front = -1; rear = -1; }
            else front++;
            return value;
        }

        public T peek() {
            if (isEmpty()) throw new IllegalStateException("Queue is Empty");
            return data[front];
        }
    }
}

