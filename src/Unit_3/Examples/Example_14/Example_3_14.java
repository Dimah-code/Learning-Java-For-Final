package Unit_3.Examples.Example_14;

import java.util.Scanner;

public class Example_3_14 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x , y;
        System.out.println("Enter x value: ");
        x = scanner.nextInt();
        if(x == 0){
            y = 10;
        }
        else{
            y = (5 * x * x) - (3 * x + 6);
        }
        System.out.println("x = " + x + " y = " + y );
    }
}
