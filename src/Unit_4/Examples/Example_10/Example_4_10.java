package Unit_4.Examples.Example_10;
public class Example_4_10 {
    public static void main(String[] args) {
        Change c = new Change();
        int a = 100;
        int b = 200;
        c.setXY(a , b);
        System.out.println("Before Change");
        c.show();
        c = changeMethod(c);
        System.out.println("After change");
        c.show();
    }
    public static Change changeMethod(Change c){
        c.switchNumbers();
        return c;
    }
}
