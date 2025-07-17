package Unit_4.Examples.Example_4;
public class Time {
    private int h , m ,s;
    Time(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }
    public void showTime(){
        System.out.printf("%d:%d:%d\n", h, m , s);
    }
}
