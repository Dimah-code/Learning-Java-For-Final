package Unit_2.Examples.Example_9;

import java.util.Scanner;

public class Example_2_9 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int num1, num2, num3;
        float avg;
        System.out.println("Enter 3 numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        avg = (num1 + num2 + num3) / 3;
        System.out.printf("average without float casting = %5.2f", avg);
        avg = (float)(num1 + num2 + num3 ) / 3;
        System.out.printf("\n average with float casting = %5.2f", avg);
    }
}
