// Abstract class Shape
abstract class Shape {
    // Abstract method to print the area
    public abstract void printArea();
}

// Class for Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize dimensions
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void printArea() {
        double area = length * width; // Calculate area
        System.out.println("Area of the rectangle is: " + area);
    }
}

// Class for Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor to initialize dimensions
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void printArea() {
        double area = 0.5 * base * height; // Calculate area
        System.out.println("Area of the triangle is: " + area);
    }
}

// Class for Circle
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void printArea() {
        double area = Math.PI * radius * radius; // Calculate area
        System.out.println("Area of the circle is: " + area);
    }
}

// Main class to demonstrate the functionality
public class ShapeDemo {
    public static void main(String[] args) {
        // Create a Rectangle object
        Shape rectangle = new Rectangle(5.0, 3.0);
        rectangle.printArea(); // Call printArea to display the area

        // Create a Triangle object
        Shape triangle = new Triangle(4.0, 6.0);
        triangle.printArea(); // Call printArea to display the area

        // Create a Circle object
        Shape circle = new Circle(2.5);
        circle.printArea(); // Call printArea to display the area
    }
}
                                                                                         
