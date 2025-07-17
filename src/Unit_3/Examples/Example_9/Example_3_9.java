package Unit_3.Examples.Example_9;

import java.util.Scanner;

public class Example_3_9 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 41; i <= 120 ; i++) {
            System.out.print(i + " = " + (char)i + "\t");
            if(i % 5 == 0){
                System.out.println();
            }
        }
    }
}
