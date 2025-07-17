package Unit_2.Examples.Example_8;

import java.util.Scanner;

public class Example_2_8 {
    static Scanner scanner = new Scanner(System.in);
    static final float PVALUE = 3.14f;
    public static void main(String[] args){
        float r, p, s;
        System.out.println("Enter circle's r: ");
        r = scanner.nextFloat();
        p = r * PVALUE * 2;
        s = r * r * PVALUE;
        System.out.printf("perimetive = %.2f \n", p);
        System.out.printf("area = %.2f ", s);
    }
}
