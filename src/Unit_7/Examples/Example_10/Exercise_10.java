package Unit_7.Examples.Example_10;

public class Exercise_10 {
    public static void main(String[] args) {
        Rect r = new Rect(10, 20);
        Square sq = new Square(10);
        System.out.printf(">>> Rectangle " + r);
        r.PrintMe();

        System.out.printf(">>> Square " + sq);
        sq.PrintMe();
    }
}
