public class Circle extends Shape {
    double radius;
    Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }
    double calculateArea(){
        return radius*radius;
    }
    double calculatePerimeter(){
        return 2*(3.14)*radius;
    }
    void display(){
        System.out.print("This is a "+super.color+" circle");
    }
}
