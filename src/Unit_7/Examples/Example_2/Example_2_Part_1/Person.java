package Unit_7.Examples.Example_2.Example_2_Part_1;
public class Person {
    private String firstName;
    private String lastName;
    public Person(){
        firstName = "";
        lastName = "";
    }
    public Person(String first, String last){
        setName(first, last);
    }
    public void setName(String first , String last){
        this.firstName = first;
        this.lastName = last;
    }
    public String toStr(){
        return (firstName + " " + lastName);
    }
}
