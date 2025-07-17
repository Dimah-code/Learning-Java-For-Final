package Unit_3.Examples.Example_13;

import java.util.Scanner;

public class Example_3_13 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int inp;
        boolean done = true;
        while(done){
            inp = scanner.nextInt();
            switch (inp){
                case 40:
                    System.out.println("40 Walt = 1000Rials");
                    break;
                case 60:
                    System.out.println("60 Walt = 1200Rials");
                    break;
                case 75:
                    System.out.println("75 Walt = 1500Rials");
                    break;
                case 100:
                case 150:
                    System.out.println("100 & 150 Walt = 1800Rials");
                    break;
                case 200:
                    System.out.println("200 Walt = 2500Rials");
                    break;
                default:
                    System.out.println("Invalid Input ");
                    done = false;
                    break;
            }
        }

    }
}
