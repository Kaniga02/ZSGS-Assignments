package Day4;

import java.util.*;

public class FindAreaofCircle{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        c.setPoint(x, y);

        c.setRadius(r); 

        c.printCircle();

        sc.close();

    }
}

class Point{
    private int x;
    private int y;

    Point()
    {
        x = y =0;
    }

    public void setPoint(int x,int y)
    {
        this.x = x;
        this.y =y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void printPoint()
    {
        System.out.println("Circle center is "+this.x+" , "+this.y);
    }
}//class point

class Circle extends Point{
    private double radius; 
    Circle()
    {
        radius = 1;
    }

    // Set radius with validation
    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else
            this.radius = 1;
    }

     // Get radius
    public double getRadius() {
        return radius;
    }

    // Calculate area
    public double area() {
        return 3.14 * radius * radius;
    }

    public void printCircle() {
        System.out.print("Circle center is ");
        printPoint(); // from Point
        System.out.println();
        System.out.println("Radius is " + getRadius());
        System.out.println("Area is " + area());
    }
}


