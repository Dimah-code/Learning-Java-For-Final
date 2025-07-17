package Unit_2.Examples.Example_11;

import java.util.Scanner;

public class Example_2_11 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a , b , c;
        System.out.println("Enter 3 number: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();
        MaxNum(a, b , c);
    }
    public static void MaxNum(int x , int y , int z){
         int max = x;
         if(y > x){
             max = y;
         }
         if (z > max) {
             max = z;
         }
        System.out.println("Max Number: " + max);
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
}
