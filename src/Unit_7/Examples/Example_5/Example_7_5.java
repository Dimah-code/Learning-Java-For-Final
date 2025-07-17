package Unit_7.Examples.Example_5;

public class Example_7_5 {
    public static void main(String[] args) {
        EmployeeServ employee = new EmployeeServ();
        employee.setEmployeeNumber(228398);
        employee.setEmployeeSalary(12000000);
        employee.setRegion(2);
        System.out.println("ID: " + employee.getEmployeeNumber() +
                " Salary: " + employee.getEmployeeSalary() +
                " Region: " + employee.getRegion());
    }
}
