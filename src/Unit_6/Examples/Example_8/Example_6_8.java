package Unit_6.Examples.Example_8;
import java.util.Scanner;
public class Example_6_8 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] list = { 10 , 20 , 30 , 40 , 50 , 60 , 70};
        int num;
        int found;
        System.out.println("Enter a number to search it in array: ");
        num = in.nextInt();
        found = BinarySearch(list, list.length, num);
        if(found != -1)
            System.out.println("number " + num + " foound in location: " + found);
        else
            System.out.println("nuber not found!");
    }
    private static int BinarySearch(int[] list, int len, int number){
        int first = 0, last = len - 1, mid = 0;
        boolean found = false;
        while(!found && first <= last){
            mid = (first + last) / 2;
            if(list[mid] == number){
                found = true;
            }
            else if(list[mid] > number){
                last = mid - 1;
            }
            else{
                first = mid + 1;
            }
        }


        if(found)
            return mid;
        else
            return -1;
    }
}
