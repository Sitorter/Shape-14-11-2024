import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
    abstract void calculatePerimeter();
}
class Circle extends Shape {
    public double calculateArea() {
        double radius = 10;
        double area = Math.PI * radius * radius;
        return area;
    }
    void calculatePerimeter() {
        double perimeter = calculateArea();
        System.out.println(perimeter);
    }
}
class Triangle extends Shape {
    public double calculateArea() {
        double a, b, h;
        a = 10;
        b = 20;
        h = 30;
        double area = ((a + b)*h)/2;
        return area;
    }
    void calculatePerimeter() {
        double perimeter = calculateArea();
        System.out.println(perimeter);
    }
}
public class Main {
    public static void main(String[] args) {
    Circle circle = new Circle();
    circle.calculatePerimeter();
    Triangle triangle = new Triangle();
    triangle.calculatePerimeter();
    }
}