package Unit_6.Examples.Example_7;
import java.util.Scanner;

public class Example_6_7 {
    public static void main(String[] args) {
        int[] list = {12, 523, 2, 4 , 7, 3};
        int number;
        System.out.println("Enter a number to search in array: ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        in.close();
        int found = seqSearch(list, number);
        if(found != -1)
            System.out.println("number found in " + found);
        else
            System.out.println("number not found!");
    }
    private static int seqSearch(int[] list , int number){
        boolean found = false;
        int loc = 0, foundIn;
        while(!found && loc < list.length)
                if(list[loc] == number)
                    found = true;
                else
                    loc++;
        if(found)
            return loc;
        else
            return -1;


    }
}


