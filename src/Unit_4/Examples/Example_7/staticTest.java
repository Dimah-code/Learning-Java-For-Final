import java.io.*;
public class staticTest {
    private int x;

    private static int count;
    public staticTest(){
        x = 0;
    }
    public staticTest(int a){
        x = a;
    }
    void setX(int a){
        x = a;
    }
    public int getX(){
        return x;
    }
    public int getcount(){
        return count;
    }
    public static void incrementCount(){
        count++;
    }
    public String toStr(){
        return ("x " + x + " and count " + count);
    }

}
