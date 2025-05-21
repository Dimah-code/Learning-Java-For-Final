import java.util.*;
public class Example_4_2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        rect.readParam();
        rect.calculate();
        rect.display();
    }
}