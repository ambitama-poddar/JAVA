// Develop an interface with two methods for computing area and perimeter of a 2D shape. Develop a
// class Circle that implements this interface with necessary data members. Develop another class
// Rectangle that implements the interface with necessary data members. Develop a class containing the
// main method and show the area and perimeter of a circle object with specified radius and center and
// the area and perimeter of a rectangle object with specified dimensions.

import java.util.Scanner;

interface Dimensions{
    void area();
    void perimeter();
}

class Circle implements  Dimensions{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public void area() {
        System.out.println("Area of circle is "+Math.PI*radius*radius);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of circle is "+2*Math.PI*radius);
    }
}

class Rectangle implements Dimensions{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle is "+length*breadth);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of rectangle is "+2*(length+breadth));
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        circle.area();
        circle.perimeter();
        System.out.println("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length,breadth);
        rectangle.area();
        rectangle.perimeter();
        sc.close();
    }
}
