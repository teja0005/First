import java.lang.Math;
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
        System.out.print("This is a "+super.color+" triangle");
    }
}
