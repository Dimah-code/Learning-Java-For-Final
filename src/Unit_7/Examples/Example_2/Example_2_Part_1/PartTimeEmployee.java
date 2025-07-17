package Unit_7.Examples.Example_2.Example_2_Part_1;
public class PartTimeEmployee extends Person_6 {
    private int rate;
    private int hours;

    public PartTimeEmployee(){
        super();
        rate = 0;
        hours = 0;
    }
    public PartTimeEmployee(int h , int r , String f , String l){
        super(f, l);
        rate = r;
        hours = h;
    }
    public int calculate(){
        return (hours * rate);
    }
    public String toStr(){
        return (super.toStr() + "\t\t" + calculate());
    }
}
