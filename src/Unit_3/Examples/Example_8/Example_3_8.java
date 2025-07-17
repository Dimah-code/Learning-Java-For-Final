package Unit_3.Examples.Example_8;

import java.util.Scanner;

public class Example_3_8 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int fee, hours, salary;
        System.out.println("Enter fee: ");
        fee = scanner.nextInt();
        System.out.println("Enter hours: ");
        hours = scanner.nextInt();
        calculateSalary(fee, hours);
    }
    public static void calculateSalary(int fee, int hours){
        int commonWork = 40, overTime = hours - commonWork;
        double salary = 0, overTimeSalary = 0;
        if(hours > commonWork){
            overTimeSalary = overTime * (fee * 1.5) ;
            salary = overTimeSalary + (commonWork * fee);
        }
        else{
            salary = hours * fee;
        }
        System.out.println("Regular pay: " + (commonWork * fee));
        System.out.println("Overtime pay: " + overTimeSalary);
        System.out.println("Total salary = " + salary);
    }
}
