import java.lang.Math;

// Shape class
public class Shape {
    String color;
    Shape(String color){
        this.color=color;
    }
    public double calculateArea(){
        return 0.0;
    }
    public double calculatePerimeter(){
        return 0.0;
    }
    public void display(){
        System.out.print("This is a shape with color -"+this.color); //here this.color or just color?
    }
}

//Circle class
public class Circle extends Shape {
    double radius;
    Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }
    public double calculateArea(){
        return radius*radius;
    }
    public double calculatePerimeter(){
        return 2*(3.14)*radius;
    }
    public void display(){
        System.out.print("This is a "+super.color+" circle");
    }
}

//Triangle class
public class Triangle extends Shape{
    double width,height;
    Triangle(String color,double width,double height){
        super(color);
        this.width=width;
        this.height=height;
    }
    double calculateArea(){
        return 0.5*width*height;
    }
    double calculatePerimeter(){
        return this.width+Math.sqrt((4*this.height*this.height)+(this.width*this.width));
    }
    void display(){
        System.out.print("This is a "+super.color+" traingle");
    }
}

//Rectangle class
public class Rectangle extends Shape{
    double length,breadth;
    Rectangle(String color,double length,double breadth){
        super(color);
        this.length=length;
        this.breadth=breadth;
    }
    double calculateArea(){
        return length*breadth;
    }
    double calculatePerimeter(){
        return 2*(length+breadth);
    }
    void display(){
        System.out.print("This is a "+super.color+" Rectangle");
    }
}

// Square class
public class Square extends Rectangle{
    Square(String col, double side){
        super(col,side,0);
    }
    void display(){
        System.out.print("This is a "+super.color+" Square");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle shape2=new Circle("red",24);
        shape2.display();
        System.out.print("-- Area is "+shape2.calculateArea());
        System.out.println("-- Perimeter is "+shape2.calculatePerimeter());
        Rectangle shape3=new Rectangle("Purple",12,2);
        shape3.display();
        System.out.print("-- Area is "+shape3.calculateArea());
        System.out.println("-- Perimeter is "+shape3.calculatePerimeter());
        Triangle shape4=new Triangle("pink",12,2);
        shape4.display();
        System.out.print("-- Area is "+shape4.calculateArea());
        System.out.println("-- Perimeter is "+shape4.calculatePerimeter());
        Square shape5=new Square("Lemon",5);
        shape5.display();
        System.out.print("-- Area is "+shape5.calculateArea());
        System.out.println("-- Perimeter is "+shape5.calculatePerimeter());
    }
}




//OUTPUT

This is a red circle-- Area is 576.0-- Perimeter is 150.72
This is a Purple Rectangle-- Area is 24.0-- Perimeter is 28.0
This is a pink traingle-- Area is 12.0-- Perimeter is 24.64911064067352
This is a Lemon Square-- Area is 0.0-- Perimeter is 10.0