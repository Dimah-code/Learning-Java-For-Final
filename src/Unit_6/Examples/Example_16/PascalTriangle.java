package Unit_6.Examples.Example_16;
public class PascalTriangle {
    private int[][] pasTri;
    private int high;
    public void setHigh(int h){
        high = h;
    }
    public void BuildTri(){
        pasTri = new int[high][];
        pasTri[0] = new int[1];
        pasTri[0][0] = 1;
        int row = 1;
        while(row< pasTri.length){
             int lastRow[] = pasTri[row - 1];
             int newRow[] = new int[row + 1];
             newRow[0] = 1;
             newRow[newRow.length - 1] = 1;
            for(int i = 1; i < newRow.length - 1; i++){
                 newRow[i] = lastRow[i - 1] + lastRow[i];
            }
         pasTri[row] = newRow;
         row++;
        }
    }
    public void display(){
        for(int i = 0; i < pasTri.length; i++){
            for(int j = 0; j < (pasTri.length - i); j++){
                System.out.println(" ");
            }
            for(int j = 0; j < pasTri[i].length; j++){
                System.out.print(" " + pasTri[i][j]);
            }
            System.out.println();
        }
    }
}
