package Unit_3.Examples.Example_5;

import java.util.Scanner;

public class Example_3_5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number to find factorial: ");
        int num = scanner.nextInt();
        long f = 1;
        for(int i = 2; i <= num; i++){
            f *= i;
        }
        System.out.println("Factorial of number " + num + " => " + f);
    }
}
