package Esercizio1;

@SuppressWarnings("unchecked")
public class ArrayQueue<T> {
    private T[] _data;
    private int _front;
    private int _rear;
    private final int _maxSize;

    // Costruttore: alloca l'array e inizializza i puntatori a -1
    // che indica queue vuota
    public ArrayQueue(int maxSize) {
        _maxSize = maxSize;
        _data = (T[]) new Object[maxSize];
        _front = -1;
        _rear = -1;
    }

    // Queue piena quando rear ha raggiunto l'ultimo slot
    public boolean isFull()
    {
         return _rear == _maxSize - 1;
    }

    // Queue vuota quando entrambi i puntatori sono a -1
    public boolean isEmpty()
    {
        return _front == -1 && _rear == -1;
    }

    // Continuare


}
