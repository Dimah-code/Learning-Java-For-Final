package Unit_4.Examples.Example_7;
public class Example_4_7 {
    public static void main(String[] args) {
        staticTest obj1 = new staticTest();
        staticTest obj2 = new staticTest();
        System.out.println("line 7: obj1: " + obj1.getcount());
        System.out.println("line 8: obj1: " + obj2.getcount());
        System.out.println("++ with class");
        staticTest.incrementCount();
        System.out.println("obj1 : " + obj1.getcount());
        System.out.println("obj2 : " + obj2.getcount());
        System.out.println("Increment count using obj1");
        obj1.incrementCount();
        System.out.println("obj1: " + obj1.getcount());
        System.out.println("obj2: " + obj2.getcount());
        obj2.incrementCount();
        System.out.println("obj1: " + obj1.getcount());
        System.out.println("obj2: " + obj2.getcount());
        System.out.println("set x to 10");
        obj1.setX(10);
        System.out.println("obj1 " + obj1.getcount());
        System.out.println("obj2 " + obj2.getcount());
    }
}
