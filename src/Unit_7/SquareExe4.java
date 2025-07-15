package Unit_7;

public class SquareExe4 {
    private double height, width;
    protected double surfaceArea;
    public SquareExe4(){
        setData(0, 0);
    }
    public SquareExe4(double height, double width){
        setData(height, width);
    }
    public void setData(double height, double width){
        this.height = height;
        this.width = width;
        ComputeSurfaceArea();
    }
    public void ComputeSurfaceArea(){
        surfaceArea = height * width;
    }
    // Getters
    public double getHeight(){return height;}
    public double getWidth(){return width;}
    public double getSurfaceArea(){return surfaceArea;}
}
