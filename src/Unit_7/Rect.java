package Unit_7;

public class Rect extends GeometricShape {
    protected double length, width;
    public Rect(){
        this(0, 0);
    }
    public Rect(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void calculate(){
        area = length * width;
        perimeter = 2 * (length + width);
    }
    public String toString(){
        return String.format("Rectangle:\nLength = %6.2f  Width = %6.2f\n", length, width);
    }
}
