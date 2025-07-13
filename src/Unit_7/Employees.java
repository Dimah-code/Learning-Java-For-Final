package Unit_7;

public class Employees {
    protected long employeeNumber;
    protected long employeeSalary;
    protected void setEmployeeNumber(long number){
        employeeNumber = number;
    }
    public void setEmployeeSalary(long salary){
        employeeSalary = salary;
    }
    public long getEmployeeNumber(){
        return employeeNumber;
    }
    public long getEmployeeSalary(){
        return employeeSalary;
    }

}
