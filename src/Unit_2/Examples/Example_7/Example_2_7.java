package Unit_2.Examples.Example_7;

import java.util.Scanner;

public class Example_2_7 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int x, y, perime, area;
        System.out.println("Enter rectangle's height");
        x = scanner.nextInt();
        System.out.println("Enter rectangle's width");
        y = scanner.nextInt();
        perime = (x + y) * 2;
        area = x * y;

        System.out.printf("perimetive = %d \n", perime);
        System.out.printf("area = %d ", area);
    }
}
