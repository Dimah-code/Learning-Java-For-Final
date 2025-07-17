package Unit_6.Examples.Example_1;
import java.util.Scanner;

public class Example_6_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;
        System.out.println("read numbers and insert it into array");
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
            sum += nums[i];
        }
        System.out.println("sum of numbers in array: " + sum);
        System.out.println("Printing array in reverse mode: ");
        int len = nums.length - 1;
        for (int i = len; i >= 0 ; i--) {
            System.out.println(nums[i]);
        }

        in.close();
    }
}
