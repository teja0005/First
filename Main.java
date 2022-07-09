public class Main {
    public static void main(String[] args) {
        Shape shape2=new Circle("red",24);
        shape2.display();
        System.out.print("-- Area is "+shape2.calculateArea());
        System.out.println("-- Perimeter is "+shape2.calculatePerimeter());
        Shape shape3=new Rectangle("Purple",12,2);
        shape3.display();
        System.out.print("-- Area is "+shape3.calculateArea());
        System.out.println("-- Perimeter is "+shape3.calculatePerimeter());
        Shape shape4=new Triangle("pink",12,2);
        shape4.display();
        System.out.print("-- Area is "+shape4.calculateArea());
        System.out.println("-- Perimeter is "+shape4.calculatePerimeter());
        Shape shape5=new Square("Lemon",5);
        shape5.display();
        System.out.print("-- Area is "+shape5.calculateArea());
        System.out.println("-- Perimeter is "+shape5.calculatePerimeter());
        Rectangle shape6=new Square("Lemon",5);
    }
}