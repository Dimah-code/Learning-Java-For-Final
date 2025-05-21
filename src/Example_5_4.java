import java.util.*;
public class Example_5_4 {
    public static void main(String[] args) {
        int str = 10;
        System.out.println("string before calling method: " + str);
        switchOrder(str);
        System.out.println("string after calling method to change it" + str);
    }
    public static void switchOrder(int strM){
        System.out.println("str in method before change" + strM);
        strM = 11;
        System.out.println("str in method after change" + strM);
    }
}
