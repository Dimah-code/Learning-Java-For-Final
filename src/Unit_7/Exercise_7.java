package Unit_7;

public class Exercise_7 {

    public static void main(String[] args) {
        RectangleFigure rectangle, shapeRef;
        BoxFigure box;
        rectangle = new RectangleFigure(8, 5);
        box = new BoxFigure(10, 7 ,3);
        shapeRef = rectangle;
        System.out.println("Line 10: Rectangle: \n" + shapeRef + "\n");
        shapeRef = box;
        System.out.printf("Line 13: Box:\n" + shapeRef + "\n");
    }
}
