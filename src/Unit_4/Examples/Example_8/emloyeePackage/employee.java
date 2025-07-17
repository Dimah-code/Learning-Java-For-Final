package Unit_4.Examples.Example_8.emloyeePackage;

public class employee {
    private int no;
    private int salary;
    private empDate entryDate = new empDate();
    public employee(int num , int sal){
        no = num;
        salary = sal;
    }
    public void display(){
        System.out.println("NO: " + no + " , Salary: " + salary);
        System.out.println("Date of hire: ");
        System.out.println(entryDate.month+"/"+entryDate.day+"/"+entryDate.year);

    }
}
