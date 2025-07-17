import java.util.Vector;

public class Example_6_13 {
    public static void main(String[] args) {
        double d1= 10.5,d2= 20.5,d3= 30.5,d4 = 40.5,d5 = 50.5,max;
        max = findMax(d1,d2);
        System.out.println("Max(10.5 , 20,5) = " + max);
        max = findMax(d2,d4,d5,d1,d3);
        System.out.println("Max(20.5, 40.5, 50,5, 10,5, 30.5) = " + max );
        double[] x = {5, 10 , 15, 30, 40};
        max = findMax(x);
        System.out.println("Max in array x is : " + max);
    }
    public static double findMax(double...values){
        double largest = 0.0;
        for(double v : values){
            if(v > largest){
                largest = v;
            }
        }
        return largest;
    }
}
