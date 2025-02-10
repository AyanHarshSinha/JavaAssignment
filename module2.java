/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

package utilities;

// MathUtils class inside the utilities package
public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}

// Demonstration class
import utilities.MathUtils;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println("Sum: " + MathUtils.add(5, 3));
    }
}

// Example Output:
// Sum: 8

// Defining the Shape interface inside the shapes package
package shapes;

public interface Shape {
    double area();
    double perimeter();
}

// Implementing the Circle class
package shapes;

public class Circle implements Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
    
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Implementing the Rectangle class
package shapes;

public class Rectangle implements Shape {
    private double length, width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double area() {
        return length * width;
    }
    
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Example Output:
// Circle Area: 78.54
// Circle Perimeter: 31.42
// Rectangle Area: 20.0
// Rectangle Perimeter: 18.0

// Demonstration of Java Util Package
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Numbers: " + numbers);
    }
}

// Example Output:
// Numbers: [10, 20, 30]

// Functional Interface and Lambda Expression
@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.compute(10, 5));
        System.out.println("Subtraction: " + subtract.compute(10, 5));
        System.out.println("Multiplication: " + multiply.compute(10, 5));
    }
}

// Example Output:
// Addition: 15
// Subtraction: 5
// Multiplication: 50

// Sorting Strings using Lambda
import java.util.*;

public class StringSortDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana", "Apple", "Cherry", "Mango");
        words.sort((a, b) -> b.compareTo(a));
        System.out.println("Sorted List: " + words);
    }
}

// Example Output:
// Sorted List: [Mango, Cherry, Banana, Apple]

// Method Reference for Square Calculation
public class MethodReferenceDemo {
    public static int square(int x) {
        return x * x;
    }
    
    public static void main(String[] args) {
        java.util.function.Function<Integer, Integer> func = MethodReferenceDemo::square;
        System.out.println("Square: " + func.apply(5));
    }
}

// Example Output:
// Square: 25

// Exception Handling Demo
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

// Example Output:
// Caught ArithmeticException: / by zero
// Finally block executed

// Custom Exception for Age Validation
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeCheck {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age must be at least 18.");
    }
    
    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

// Example Output:
// Exception: Age must be at least 18.

// Throw and Throws Keyword Demonstration
public class FactorialDemo {
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }
    
    public static void main(String[] args) {
        try {
            System.out.println("Factorial: " + factorial(-5));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

// Example Output:
// Exception: Factorial is not defined for negative numbers.
