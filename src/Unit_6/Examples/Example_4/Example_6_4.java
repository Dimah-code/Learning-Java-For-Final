import java.text.NumberFormat;
import java.util.Scanner;

public class Example_6_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter How Many Numbers Do You Need To Enter: ");
        int[] x = new int[in.nextInt()];
        for (int i = 0; i < x.length; i++) {
            System.out.println("Enter " + i + 1 + "number: ");
            x[i] = in.nextInt();
        }
        System.out.println("**************\n before calling method");
        Printer(x);
        trans(x);
        System.out.println("**************\n after calling method");
        Printer(x);
    }
    private static void trans(int[] x){
        System.out.println("************\n Changing...");
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.pow(x[i], 2));
            System.out.println(x[i]);
        }
        System.out.println("**************\n after change in method");
        Printer(x);
    }
    private static void Printer(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "]= " + x[i] + "\n");
        }
    }
}
