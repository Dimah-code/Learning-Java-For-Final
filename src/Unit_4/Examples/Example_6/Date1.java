import java.util.*;
public class Date1 {
    private int y, m , d;
    Date1(){
        this(2012, 2, 5);
    }
    Date1(int y , int m , int d){
        setDate(y, m , d);
    }
    public void setDate(int y , int m , int d){
        this.y = y;
        this.m = m;
        this.d = d;
    }
    public void showDate(){
        System.out.printf("%d/%d/%d\n", m,d,y);
    }
}
