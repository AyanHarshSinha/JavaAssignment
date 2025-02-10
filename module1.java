/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// 1. Encapsulation Example
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        p.setAge(25);
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
// Output:
// Name: John
// Age: 25

// 2. Inheritance and Polymorphism
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
// Output:
// Dog barks

// 3. Abstraction using Interface
interface Vehicle {
    void start();
}
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
// Output:
// Car is starting...

// 4. Method Overloading and Overriding
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
class AdvancedMath extends MathOperations {
    @Override
    int add(int a, int b) {
        return a + b + 10;
    }
    public static void main(String[] args) {
        AdvancedMath am = new AdvancedMath();
        System.out.println("Addition: " + am.add(5, 10));
    }
}
// Output:
// Addition: 25

// 5. Class Hierarchy for Polymorphism
class AnimalHierarchy {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Cat extends AnimalHierarchy {
    @Override
    void sound() {
        System.out.println("Meow");
    }
    public static void main(String[] args) {
        AnimalHierarchy ah = new Cat();
        ah.sound();
    }
}
// Output:
// Meow

// 6. Multiple Inheritance using Interfaces
interface A {
    void methodA();
}
interface B {
    void methodB();
}
class C implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }
    public void methodB() {
        System.out.println("Method B");
    }
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
// Output:
// Method A
// Method B

// 7. Using "this" and "super"
class Parent {
    String message = "Parent Message";
}
class Child extends Parent {
    String message = "Child Message";
    void show() {
        System.out.println(this.message);
        System.out.println(super.message);
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
// Output:
// Child Message
// Parent Message

// 8. Constructor Demonstration
class ConstructorExample {
    String name;
    ConstructorExample(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample("Alice");
        System.out.println("Name: " + ce.name);
    }
}
// Output:
// Name: Alice

// 9. Final Keyword Usage
final class FinalClass {
    final int value = 10;
    final void display() {
        System.out.println("Final Method");
    }
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        System.out.println("Final Variable: " + fc.value);
        fc.display();
    }
}
// Output:
// Final Variable: 10
// Final Method

// 10. StringBuilder for Efficient String Operations
class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}
// Output:
// Hello World
