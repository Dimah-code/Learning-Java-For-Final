package Unit_2.Examples.Example_13;

import java.util.Scanner;

public class Example_2_13 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a , b , c, min , max;
        System.out.println("Enter 3 number: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();
        min = findMin(a , b , c);
        max = findMax(a, b , c);

        System.out.println("Minimum number = " + min);
        System.out.println("Max number = " + max);
    }
    public static int findMin(int x , int y, int z){
        int min;
        min = x < y ? x : y;
        min = z < min ? z : min;
        return min;
    }
    public static int findMax(int x ,int y , int z){
        int max;
        max = x > y ? x : y;
        max = z > max ? z : max;

        return max;
    }
}
