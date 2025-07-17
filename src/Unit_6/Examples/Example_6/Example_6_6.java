package Unit_6.Examples.Example_6;
import java.util.Scanner;

public class Example_6_6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 54 ,33, 22, 11,8};
        insertionSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " , ");
        }
    }
    private static void insertionSort(int[] list){
       int temp, loc;
        for (int i = 1; i < list.length; i++) {
            if(list[i] < list[i - 1]){
                temp = list[i];
                loc = i;
                do{
                    list[loc] = list[loc - 1];
                    loc--;
                }while(loc > 0 && list[loc - 1] > temp);
                list[loc] = temp;
            }
        }
    }
}
