package Unit_3.Examples.Example_2;

import java.util.Scanner;

public class Example_3_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        for(char ch = 'A'; ch <= 'F' ; ch++){
            System.out.println(ch + " = " + (int)ch);
        }
    }
}
