package Unit_4.Examples.Example_9;
public class Change {
    private int x;
    private int y;
    public void setXY(int a, int b){
        x = a;
        y = b;
    }
    public void show(){
        System.out.println("x = " + x + " y = " + y);
    }
    public void switchNumbers(){
        int temp = x;
        x = y;
        y = temp;
    }
}
