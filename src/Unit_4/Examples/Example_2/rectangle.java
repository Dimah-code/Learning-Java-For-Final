import java.util.*;
public class rectangle {
    static Scanner in = new Scanner(System.in);
    private double length;
    private double width;
    private double area;
    private double perim;
    public void readParam(){
        System.out.println("Enter length: ");
        length = in.nextDouble();
        System.out.println("Enter width: ");
        width = in.nextDouble();
    }
    public void calculate(){
        perim = (length + width) * 2;
        area = length * width;
    }
    public void display(){
        System.out.println("perimeter :" + perim);
        System.out.println("area: " + area);
    }
}