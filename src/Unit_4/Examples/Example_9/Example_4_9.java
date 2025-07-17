package Unit_4.Examples.Example_9;
public class Example_4_9 {
    public static void main(String[] args) {
        Change c = new Change();
        int a = 100;
        int b = 200;
        c.setXY(a , b);
        System.out.println("Before change: ");
        c.show();
        changeMethod(c);
        System.out.println("After switch: ");
        c.show();
    }
    public static void changeMethod(Change c){
        c.switchNumbers();
    }
}
