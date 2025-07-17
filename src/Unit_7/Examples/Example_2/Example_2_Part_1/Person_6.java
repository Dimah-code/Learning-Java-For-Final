public class Person_6 {
    private String firstName;
    private String lastName;
    public Person_6(){
        firstName = "";
        lastName = "";
    }
    public Person_6(String first, String last){
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
