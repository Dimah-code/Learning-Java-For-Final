package Unit_4.Exercises.Exercise_5;
import java.util.*;
public class student {
    static Scanner in  = new Scanner(System.in);
    private double score;
    private double avg;
    private double sum;
    private int counter;
    public void readScore(){
        System.out.println("Enter Grade Course: ");
        score = in.nextDouble();
        counter++;
    }
    public void getSum(){
        sum += score;
    }
    public void getAvg(){
        avg = sum / counter;
    }
    public void display(){
        System.out.printf("sum of scores: %.2f\n" , sum);
        System.out.printf("Student's Average: %.2f", avg);
    }
}
