package Unit_7.Examples.Example_4;
public class Sample {
    private static int sum;
    private static int count;
    private int myValue;
    public Sample(int x){
        myValue = x;
        count++;
        sum += myValue;
    }
    public static int getSum(){
        return sum;
    }
    public static int getCount(){
        return count;
    }
    public int getMyValue(){
        return myValue;
    }
    public String toStr(){
        return (myValue+ ", "+ sum + ", " +count);
    }
}
