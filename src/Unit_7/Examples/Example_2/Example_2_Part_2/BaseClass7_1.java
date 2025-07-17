public class BaseClass7_1 {
    private String firstName, lastName;
    public static void sayHello(){
        System.out.println("Hello");
    }
    public BaseClass7_1(){
        setName("Emptyfirst", "Emptylast");
    }
    public BaseClass7_1(String firstName, String lastName){
        setName(firstName, lastName);
    }
    private void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString(){
        return  ("Firstname: " + firstName + " Lastname: " + lastName);
    }
}
