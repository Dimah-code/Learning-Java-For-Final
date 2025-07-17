package Unit_3.Examples.Example_1;

import java.util.Scanner;

public class Example_3_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x ,i , sum = 0, avg;
        System.out.println("Enter 5 number to find average: ");
        for(i = 1; i <= 5 ; i++){
            x = scanner.nextInt();
            sum += x;
        }
        avg = sum / 5;
        System.out.println("average = " + avg);
    }
}
