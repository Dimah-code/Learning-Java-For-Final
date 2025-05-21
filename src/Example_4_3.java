import java.util.*;
public class Example_4_3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Temperature temper = new Temperature();
        System.out.println(temper.getTemperature());
        temper.setTemperature(20.1);
        System.out.println(temper.getTemperature());
    }
}