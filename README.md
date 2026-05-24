# Java Factories

A growing collection of reusable Java utility libraries, organized by domain.
Every module is designed to be clean, dependency-free, and ready to drop into any Java project.

> **This repository is actively maintained.** New libraries and utilities are added on a regular basis as the project expands. Check back often for updates.

---

## Requirements

| Tool | Version |
|------|---------|
| Java | 17+ |
| Maven | 3.8+ |
| JUnit | 5.10 (test scope, managed by Maven) |

---

## Project Structure

```
src/
├── main/java/com/javafactories/
│   ├── primitives/       Type conversion utilities
│   ├── strings/          String manipulation utilities
│   ├── math/             Math and number utilities
│   ├── collections/      Array, List and Matrix utilities
│   ├── geometry/         Geometric shapes hierarchy
│   ├── people/           Person, Student and WorkingStudent hierarchy
│   ├── employees/        Employee, Manager and Director hierarchy
│   └── vehicles/         Vehicle hierarchy
└── test/java/com/javafactories/
    └── ...               JUnit 5 tests mirroring the main structure
```

---

## Libraries

### `primitives` — TypeConverter

Utilities for Java type conversions and overflow behavior.

```java
import com.javafactories.primitives.TypeConverter;

double d   = TypeConverter.toDouble(42);          // 42.0
int    i   = TypeConverter.toInt(3.9);            // 3  (truncates)
char   c   = TypeConverter.toChar(65);            // 'A'
String bin = TypeConverter.toBinary(10);          // "1010"
String hex = TypeConverter.toHex(255);            // "ff"
byte   b   = TypeConverter.addByte((byte)127, (byte)1); // -128 (overflow)
```

---

### `strings` — StringUtils

String manipulation without boilerplate.

```java
import com.javafactories.strings.StringUtils;

String joined  = StringUtils.concat(" ", "Hello", "World"); // "Hello World"
String upper   = StringUtils.toUpperCase("java");           // "JAVA"
String lower   = StringUtils.toLowerCase("JAVA");           // "java"
char   ch      = StringUtils.charAt("Java", 1);            // 'a'
String[] words = StringUtils.splitWords("Hello World");    // ["Hello", "World"]
boolean same   = StringUtils.equalsIgnoreCase("A", "a");   // true
boolean isUp   = StringUtils.isUpperCase('A');             // true
```

---

### `math` — MathUtils

Common numeric operations and timing utilities.

```java
import com.javafactories.math.MathUtils;

int    max    = MathUtils.max(3, 10);             // 10
int    min    = MathUtils.min(3, 10);             // 3
double div    = MathUtils.divide(5, 2);           // 2.5
boolean even  = MathUtils.isEven(4);              // true
boolean div10 = MathUtils.isDivisible(10, 2);    // true
int    sum    = MathUtils.sumRange(1, 100);       // 5050
long   nanos  = MathUtils.measureNanos(() -> {
    // any operation to time
});
```

---

### `collections` — ArrayUtils · ListUtils · MatrixUtils

#### ArrayUtils — operations on `int[]` and `int[][]`

```java
import com.javafactories.collections.ArrayUtils;

int[] range    = ArrayUtils.range(1, 5);           // [1, 2, 3, 4, 5]
int[] evens    = ArrayUtils.evenRange(2, 10);      // [2, 4, 6, 8, 10]
int   total    = ArrayUtils.sum(new int[]{1,2,3}); // 6
int[] filtered = ArrayUtils.evenValues(new int[]{1,2,3,4}); // [2, 4]
int[] negs     = ArrayUtils.negativeValues(new int[]{-1,2,-3}); // [-1, -3]

int[][] matrix = {{1,3,5},{7,9,11}};
int rowSum = ArrayUtils.sumRow(matrix, 0);         // 9
int colSum = ArrayUtils.sumColumn(matrix, 1);      // 12
int idx    = ArrayUtils.binarySearch(matrix, 9);   // flat index (found)
```

#### ListUtils — operations on `List<Integer>`

```java
import com.javafactories.collections.ListUtils;

List<Integer> list    = ListUtils.of(3, 1, 4, 1, 5);
List<Integer> rev     = ListUtils.reverse(list);            // [5, 1, 4, 1, 3]
int           max     = ListUtils.max(list);                // 5
int           min     = ListUtils.min(list);                // 1
double        avg     = ListUtils.average(list);            // 2.8
List<Integer> above   = ListUtils.filterAbove(list, 3);     // [4, 5]
List<Integer> zeroTo4 = ListUtils.range(5);                 // [0, 1, 2, 3, 4]
```

#### MatrixUtils — operations on `List<List<Integer>>` and `int[][]`

```java
import com.javafactories.collections.MatrixUtils;

// Dynamic matrix (List-based)
var matrix = MatrixUtils.create(3, 3, 0);  // 3x3 filled with 0
int sum    = MatrixUtils.sum(matrix);      // 0
List<Integer> diag = MatrixUtils.diagonal(matrix); // [0, 0, 0]

// Static matrix (array-based)
int[][] m    = {{1,2},{3,4}};
int total    = MatrixUtils.sum(m);         // 10
int diagSum  = MatrixUtils.diagonalSum(m); // 5  (1+4)
```

---

### `geometry` — Shape · Circle · Rectangle · Square

Abstract base class `Shape` with concrete implementations.

```java
import com.javafactories.geometry.*;

Shape circle = new Circle(5);
Shape rect   = new Rectangle(4, 3);
Shape square = new Square(6);

circle.area();     // 78.539...  (π * r²)
rect.area();       // 12.0
square.area();     // 36.0

circle.describe(); // "Circle with radius 5.0"
rect.describe();   // "Rectangle 4.0x3.0"
square.describe(); // "Square with side 6.0"

System.out.println(circle); // "Circle [area=78.54]"

// Polymorphism
List<Shape> shapes = List.of(new Circle(3), new Rectangle(2, 5), new Square(4));
shapes.forEach(s -> System.out.println(s.describe() + " → area: " + s.area()));
```

**Hierarchy:**
```
Shape (abstract)
├── Circle
└── Rectangle
    └── Square
```

---

### `people` — Person · Student · WorkingStudent

A person hierarchy demonstrating inheritance and interface implementation.

```java
import com.javafactories.people.*;

Person p = new Person("Alice", 30);
p.greet();           // "Hello, my name is Alice"
p.growOlder();       // age → 31
p.login();           // isOnline → true
p.getDayName(1);     // "Monday"
p.setFavoriteDay(8); // throws IllegalArgumentException

Student s = new Student("Bob", 20, "Computer Science");
s.greet();           // "Hello, my name is Bob - I study Computer Science"
s.study();           // "Student Bob is studying Computer Science"

WorkingStudent ws = new WorkingStudent("Carol", 22, "Math", 1200);
ws.work();           // "Working student Carol earns 1200"
ws.study();          // "I work, but I also study. Student Carol is studying Math"
```

**Hierarchy:**
```
Person
└── Student
    └── WorkingStudent  (implements Workable)

interface Workable
└── String work()
```

---

### `employees` — Employee · Manager · Director

A corporate hierarchy with salary composition.

```java
import com.javafactories.employees.*;

Employee e = new Employee("Alice", "E001", 3000);
e.getSalary();   // 3000.0
e.work();        // "Alice is working"

Manager m = new Manager("Bob", "M001", 4000, 1000);
m.getSalary();              // 5000.0  (base + bonus)
m.approveExpense(500.0);    // "Manager Bob approved expense of 500.0"
m.evaluateEmployee(e);      // "Bob is evaluating Alice"

Director d = new Director("Carol", "D001", 5000, 2000, 1500);
d.getSalary();  // 8500.0  (base + mgmt bonus + director bonus)
```

**Hierarchy:**
```
Employee
└── Manager
    └── Director

interface Payroll
└── void printSalaryDetails(Employee e)
```

---

### `vehicles` — Vehicle · Car · Bicycle

Minimal vehicle hierarchy showcasing abstract classes and polymorphism.

```java
import com.javafactories.vehicles.*;

Vehicle car  = new Car();
Vehicle bike = new Bicycle();

car.move();          // "Car moves on four wheels"
bike.move();         // "Bicycle moves on two wheels"
car.startEngine();   // "Car engine started"

// Polymorphism
List<Vehicle> fleet = List.of(new Car(), new Bicycle());
fleet.forEach(v -> System.out.println(v.startEngine() + " → " + v.move()));
```

**Hierarchy:**
```
Vehicle (abstract)
├── Car
└── Bicycle
```

---

## Running the Tests

```bash
mvn test
```

All libraries are covered by JUnit 5 unit tests located in `src/test/java/com/javafactories/`.

---

## Build

```bash
# Compile and package as JAR
mvn package

# Output
target/java-factories-1.0.0.jar
```

---

## Roadmap

New libraries are planned and will be added progressively. Upcoming modules include:

- `algorithms` — sorting, searching, and recursion utilities
- `io` — file reading/writing helpers
- `functional` — higher-order function patterns
- `datastructures` — stacks, queues, linked lists, trees

> Have an idea for a new module? Open an issue or a PR.

---

## License

This project is open source and available under the [MIT License](LICENSE).
