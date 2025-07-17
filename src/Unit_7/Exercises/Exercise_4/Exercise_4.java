package Unit_7.Exercises.Exercise_4;

public class Exercise_4 {
    public static void main(String[] args) {
        SquareExe4 sq = new SquareExe4(4, 2);
        Cube cube = new Cube(10, 6, 4);
        System.out.printf("Square SurfaceArea: %6.2f\n", sq.getSurfaceArea());
        System.out.printf("Cube SurfaceArea: %6.2f\n", cube.getSurfaceArea());
    }
}
