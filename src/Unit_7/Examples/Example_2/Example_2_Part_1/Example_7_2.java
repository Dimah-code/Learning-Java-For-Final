package Unit_7.Examples.Example_2.Example_2_Part_1;
public class Example_7_2 {
    public static void main(String[] args) {
        Person_6 person = new Person_6("Hamidreza" , "Ghareghani");
        PartTimeEmployee pte = new PartTimeEmployee(40, 20, "Ali" , "Mortazavi");
        System.out.println(person.toStr());
        System.out.println(pte.toStr());

    }
}
