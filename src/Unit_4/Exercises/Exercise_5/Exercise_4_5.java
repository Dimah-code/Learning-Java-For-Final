import java.util.*;
public class Exercise_4_5 {
    public static void main(String[] args) {
        Exer_4_student stu = new Exer_4_student();
        for(int i = 0; i < 10; i++){
            stu.readScore();
            stu.getSum();
        }
        stu.getAvg();
        stu.display();
    }
}
