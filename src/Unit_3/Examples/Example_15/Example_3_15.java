package Unit_3.Examples.Example_15;

import java.util.Scanner;

public class Example_3_15 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        n = scanner.nextInt();
        System.out.printf("fact(%d) = " + fact(n) , n);
    }
    public static long fact(int n){
        if(n != 0)
                    return n * fact(n - 1);
             return 1;
    }
}
