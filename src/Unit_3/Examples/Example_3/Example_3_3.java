package Unit_3.Examples.Example_3;

import java.util.Scanner;

public class Example_3_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for(float f = 15; f <= 18; f+= 0.5){
            System.out.println("step = " + f);
        }
    }
}
