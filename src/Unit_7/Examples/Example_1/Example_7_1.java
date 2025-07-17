package Unit_7.Examples.Example_1;
public class Example_7_1 {
    public static void main(String[] args) {
        Rectangle_6 rect1 = new Rectangle_6();
        Rectangle_6 rect2 = new Rectangle_6(8, 6);

        Box box1 = new Box();
        Box box2 = new Box(10, 7, 3);

        System.out.println("Rectangle 1 : " + rect1.toStr());
        System.out.println("Rectangle 1 area: " + rect1.area());
        System.out.println("Rectangle 2 : " + rect2.toStr());
        System.out.println("Rectangle 2 area: " + rect2.area());

        System.out.println("Box 1 = " + box1.toStr());
        System.out.println("Box 1 area: " + box1.area());
        System.out.println("Box 1 volume: " + box1.volume());

        System.out.println("Box 2 = " + box2.toStr());
        System.out.println("Box 2 area : " + box2.area());
        System.out.println("Box 2 volume : " + box2.volume());

    }
}
