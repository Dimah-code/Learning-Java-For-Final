package Unit_4.Examples.Example_5;
import java.util.*;
public class Date {
    private int y, m , d;
    Date(){
        setDate(2012, 2, 5);
    }
    Date(int y , int m , int d){
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
