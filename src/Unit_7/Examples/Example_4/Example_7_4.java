package Unit_7.Examples.Example_4;
public class Example_7_4 {
    public static void main(String[] args) {
        Sample s1 = new Sample(5);
        System.out.println("s1: " + s1.toStr());
        Sample s2 = new Sample(10);
        System.out.println("s1: " + s1.toStr());
        System.out.println("s2: " + s2.toStr());
        System.out.println("Sum of myValues: " + Sample.getSum());
        System.out.println("Number of sample objects : " + Sample.getCount());
    }
}
