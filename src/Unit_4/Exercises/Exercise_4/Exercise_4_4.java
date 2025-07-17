package Unit_4.Exercises.Exercise_4;
import java.util.*;
public class Exercise_4_4 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0, square, cube, input, sumSq = 0, sumCube = 0;

        do{
            System.out.println("Enter numbers (cancel with 0");
            input = in.nextInt();
            square = input * input;
            cube  = input * input * input;
            sum += input;
            sumSq += square;
            sumCube += cube;
        }while(input != 0);
        System.out.println("sum of numbers: " + sum);
        System.out.println("sum of square of numbers: " + sumSq);
        System.out.println("sum of cube of numbers: " + sumCube);
    }
}
