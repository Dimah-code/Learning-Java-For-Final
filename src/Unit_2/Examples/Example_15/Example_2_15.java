package Unit_2.Examples.Example_15;

import java.util.Scanner;

public class Example_2_15 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Number in main before calling method : " + a);
        plusTen(a);
        System.out.println("Number in main after calling : " + a);
    }
    public static void plusTen(int x){
        System.out.println("Number in Method before change : " + x);
        x = 20;
        System.out.println("Number in method after change : " + x);
    }
}
