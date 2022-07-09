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
