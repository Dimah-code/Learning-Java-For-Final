package Unit_4.Exercises.Exercise_1;
import java.util.*;
public class rectangle {
    static Scanner in = new Scanner(System.in);
    private int length, width , perimeter, area;
    public void readSides(){
        System.out.println("Enter length: ");
        length = in.nextInt();
        System.out.println("Enter width: ");
        width = in.nextInt();
    }
    public void calculate(){
        perimeter = (length + width) * 2;
        area = length * width;
    }
    public void display(){
        System.out.println("perimeter: " + perimeter);
        System.out.println("area: " + area);
    }
}
