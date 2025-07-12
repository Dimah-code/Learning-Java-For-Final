package Person;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        String firstName, lastName, country, role;
        int age, hours;
        double rate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname: ");
        firstName = sc.nextLine();
        System.out.println("Enter lastname: ");
        lastName = sc.nextLine();
        System.out.println("Enter his/her Country: ");
        country = sc.nextLine();
        System.out.println("Enter role: ");
        role = sc.nextLine();
        System.out.println("Enter age: ");
        age = sc.nextInt();
        System.out.println("Enter hours worked: ");
        hours = sc.nextInt();
        System.out.println("Enter rate pay: ");
        rate = sc.nextDouble();
        Employee employee = new Employee(role, hours, rate, firstName, lastName, country, age);
        System.out.println(employee.toString());
    }
}
