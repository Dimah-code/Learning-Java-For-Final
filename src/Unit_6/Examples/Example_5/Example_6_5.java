package Unit_6.Examples.Example_5;
import java.util.Scanner;
public class Example_6_5 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] grades = new int[4];
        System.out.println("Imagine you have 4 student:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter student " + (i + 1) + "th grade: ");
            grades[i] = in.nextInt();
        }
        System.out.println("Before sorting");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " , ");
        }
        System.out.println();
        selectionSort(grades);
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " , ");
        }
    }
    private static void selectionSort(int[] arr){
        int smallest, minIndex, temp, len = arr.length;
        for(int i = 1; i < len - 1; i++){
            smallest = i;
            for(int j = i + 1; j < len; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            temp = arr[smallest];
            arr[smallest] = arr[i - 1];
            arr[i - 1] = temp;
        }
    }
}
