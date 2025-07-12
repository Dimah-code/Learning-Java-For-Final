package Person;

public class Person {
    private String firstName, lastName,country;
    private int age;
    public Person(){
        setPersonInfo("Empty Name", "Empty Family", "No Country", 1);
    }
    public Person(String firstName, String lastName, String country, int age){
        setPersonInfo(firstName, lastName, country, age);
    }
    public void setPersonInfo(String firstName, String lastName, String country, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getCountry(){
        return country;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return ("Firstname: " + getFirstName() + " | Lastname: " + getLastName()
        + " | Country: " + getCountry() + " | Age: " + getAge());
    }
}
