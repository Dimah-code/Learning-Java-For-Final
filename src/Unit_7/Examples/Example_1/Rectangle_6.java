package Unit_7.Examples.Example_1;
public class Rectangle_6 {
    private double length, width;
    public Rectangle_6(){
        setDeimension(0.0, 0.0);
    }
    public Rectangle_6(double l , double w){
        setDeimension(l , w);
    }
    public void setDeimension(double l, double w){
        if(l >= 0){
            length = l;
        }else {
            length = 0;
        }
        if(w >= 0){
            width = w;
        }else{
            width = 0;
        }
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double area(){
        return length * width;
    }
    public double perimeter(){
        return 2 * (length + width);
    }
    public String toStr(){
        return ("Length = " + length + " , Width = " + width);
    }
}
