package Unit_6.Examples.Example_16;
import java.util.*;
public class Example_6_16 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int high;
        PascalTriangle triangle = new PascalTriangle();
        System.out.println("Enter the high of triangle: ");
        high = console.nextInt();
        triangle.setHigh(high);
        triangle.BuildTri();
        triangle.display();
    }
}
