package Unit_2.Examples.Example_14;

import java.util.Scanner;

public class Example_2_14 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a , b , c, maxInt;
        float m , n , o, maxFloat;
        System.out.println("Enter 3 integer number: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        System.out.println("Enter 3 float number: ");
        m = scanner.nextFloat();
        n = scanner.nextFloat();
        o = scanner.nextFloat();
        scanner.close();
        maxFloat = maxFloat(m , n , o);
        maxInt = maxInt(a, b , c);

        System.out.println("Maximum Float number = " + maxFloat);
        System.out.println("Maximum Int number = " + maxInt);
    }
    public static float maxFloat(float x , float y, float z){
        float max;
        max = x > y ? x : y;
        max = z > max ? z : max;
        return max;
    }
    public static int maxInt(int x ,int y , int z){
        int max;
        max = x > y ? x : y;
        max = z > max ? z : max;

        return max;
    }
}
