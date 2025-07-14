package instanceof_Using;

class Employee {
    protected String name;
    public Employee(String name){
        this.name = name;
    }
}
class ContractEmployee extends Employee{
    public ContractEmployee(String name){
        super(name);
    }
    public void SendRenewalReminder(){
        System.out.println("Reminder: Renewal required for " + name);
    }
}
class PermanentEmployee extends Employee{
    public PermanentEmployee(String name){
        super(name);
    }
}
public class Main{
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new ContractEmployee("ali"),
                new ContractEmployee("Morteza"),
                new PermanentEmployee("Soofiii"),
                new PermanentEmployee("Nadiya"),
                new PermanentEmployee("Jabbar"),
                new PermanentEmployee("Asghar"),
                new ContractEmployee("Jafar"),
                new ContractEmployee("Sarah"),
                new ContractEmployee("Komeyl"),
                new ContractEmployee("Saeed"),
                new ContractEmployee("Soosano"),
                new ContractEmployee("Mostafa")
        };

        for(Employee em : employees){
            if(em instanceof ContractEmployee){
                ((ContractEmployee) em).SendRenewalReminder();
            }
        }
    }
}