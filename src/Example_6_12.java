import java.util.*;
public class Example_6_12 {
    public static void main(String[] args){
        Vector<String> stringList = new Vector<String>();
        System.out.println("Empty stringList? " + stringList.isEmpty());
        System.out.println("Size stringList? " + stringList.size());
        System.out.println();
        stringList.addElement("Spring");
        stringList.addElement("Summer");
        stringList.addElement("Fall");
        stringList.addElement("Winter");
        stringList.addElement("Sunny");
        System.out.println("****** After adding element *******");
        System.out.println("Empty stringList? " + stringList.isEmpty());
        System.out.println("Size stringList? " + stringList.size());
        System.out.println("stringList contains \"Fall\"" + stringList.contains("Fall"));
        System.out.println(stringList);
        stringList.insertElementAt("Cool" , 1);
        System.out.println("***** after addding elem in pos 1 ******");
        System.out.println(stringList);
        System.out.println();
        stringList.removeElement("Fall");
        System.out.println(stringList);
        stringList.removeElementAt(2);
        System.out.println(stringList);
        System.out.println("indexof Sunny: " + stringList.indexOf("Sunny"));

    }
}
