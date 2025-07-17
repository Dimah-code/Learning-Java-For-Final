package Unit_2.Examples.Example_12;

import java.util.Scanner;

public class Example_2_12 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a , b , c;
        System.out.println("Enter 2 number: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        scanner.close();
        System.out.println(sumSqrt(a, b));
    }
    public static int sumSqrt(int x , int y){
        int sum;
        sum = x * x + y * y;
        return sum;
    }
}
