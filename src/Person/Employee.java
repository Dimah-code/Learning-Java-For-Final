package Person;

public class Employee extends Person{
    private String role;
    private int hours;
    private double rate;
    public Employee(){
        super();
        setEmployeeInfo("No role", 0, 0.0);
    }
    public Employee(String role, int hours, double rate, String firstName, String lastName,
                    String country, int age){
        super(firstName, lastName,country,age);
        setEmployeeInfo(role, hours, rate);
    }
    public void setEmployeeInfo(String role, int hours, double rate){
        this.role = role;
        this.hours = hours;
        this.rate = rate;
    }
    public String getRole(){
        return role;
    }
    public int getHours(){
        return hours;
    }
    public double getRate(){
        return rate;
    }
    public double calculatePay(){
        return (getHours() * getRate());
    }
    public String toString(){
        return (super.toString() + " | Role: " + getRole() + " | Salary: " +
                calculatePay() + "$");
    }

}
