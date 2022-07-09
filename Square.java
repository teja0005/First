public class Square extends Rectangle{
    Square(String col, double side){
        super(col,side,0);
    }
    void display(){
        System.out.print("This is a "+super.color+" Square");
    }
}
