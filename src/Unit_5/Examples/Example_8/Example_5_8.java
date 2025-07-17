package Unit_5.Examples.Example_8;
import java.text.*;
public class Example_5_8 {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(5);
        System.out.println(formatter.format(Math.PI));
        formatter.setMinimumIntegerDigits(4);
        System.out.println(formatter.format(Math.PI));
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println(money.format((3.53)));
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println(percent.format(0.353));

    }
}
