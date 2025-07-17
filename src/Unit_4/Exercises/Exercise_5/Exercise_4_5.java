package Unit_4.Exercises.Exercise_5;

public class Exercise_4_5 {
    public static void main(String[] args) {
        student stu = new student();
        for(int i = 0; i < 10; i++){
            stu.readScore();
            stu.getSum();
        }
        stu.getAvg();
        stu.display();
    }
}
