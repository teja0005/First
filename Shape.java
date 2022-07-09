public class Shape {
    String color;
    Shape(String color){
        this.color=color;
    }
    double calculateArea(){
        return 0.0;
    }
    double calculatePerimeter(){
        return 0.0;
    }
    void display(){
        System.out.print("This is a shape with color -"+this.color);
    }

}
