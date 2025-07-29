package Day4;

// Base class
class Shape {
    void print() {
        System.out.println("This is a shape");
    }
}

// Polygon inherits Shape
class Polygon extends Shape {
    @Override
    void print() {
        System.out.println("Polygon is a shape");
    }
}

// Rectangle inherits Polygon
class Rectangle extends Polygon {
    @Override
    void print() {
        System.out.println("Rectangle is a polygon");
    }
}

// Triangle inherits Polygon
class Triangle extends Polygon {
    @Override
    void print() {
        System.out.println("Triangle is a polygon");
    }
}

// Square inherits Rectangle
class Square extends Rectangle {
    @Override
    void print() {
        System.out.println("Square is a rectangle");
    }
}

// Driver class
public class ShapeHierarchy {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Polygon polygon = new Polygon();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        // Call the method using each object
        shape.print();      
        polygon.print();     
        rectangle.print();  
        triangle.print();    
        square.print();     
    }
}
