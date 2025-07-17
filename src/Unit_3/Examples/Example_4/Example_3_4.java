package Unit_3.Examples.Example_4;

import java.util.Scanner;

public class Example_3_4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.printf("%d * %d = %d \t", i , j , i * j);
            }
            System.out.println();
        }
    }
}
