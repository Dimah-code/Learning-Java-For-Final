package Unit_7.Exercises.Exercise_5;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Mohammad", "09129121212", 50000, 10);
        WithTransfer owt = new WithTransfer("Zahra", "09363663636", 1000, 5);
        System.out.println("Order withour transfer: ");
        System.out.println(order);
        System.out.println("Another order with transfer: ");
        System.out.println(owt);
    }
}
