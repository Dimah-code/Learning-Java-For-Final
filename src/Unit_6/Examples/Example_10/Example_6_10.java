import java.util.Scanner;

public class Example_6_10 {
    static Scanner in = new Scanner(System.in);
    static boolean code = false;
    private static Clerk[] clArray;
    public static void main(String[] args) {
        askArraySize();
        while (true){
            switch (menu()){
                case 1: enterData();break;
                case 2:
                    if(!code){
                        System.out.println("You didn't enter any data!");
                        break;
                    }else {
                        showData();
                        break;
                    }
                case 3:
                    System.exit(0);
            }

        }
    }
    public static void askArraySize(){
        System.out.println("How many clerks work in company: ");
        int enter = in.nextInt();
        clArray = new Clerk[enter];
    }
    public static void enterData(){
        for(int i = 0; i < clArray.length; i++){
            clArray[i] = new Clerk();
            System.out.println("Enter name for clerk " + (i + 1) + ": ");
            clArray[i].setName(in.next());
            System.out.println("Enter hours for clerk " + (i+1) + ": ");
            clArray[i].setHours(in.nextFloat());
            System.out.println("Enter rate for clerk " + (i + 1) + ": ");
            clArray[i].setRate(in.nextFloat());
        }
        code = true;
    }
    public static int menu(){
        System.out.println("\n1. Enter clerk data.");
        System.out.println("2. Show clerk data");
        System.out.println("3. Exit");
        System.out.println("Enter our select (1,2,3): ");
        int choice = in.nextInt();
        return choice;
    }
    public static void showData(){
        float grossPay, netPay, sumNetSalary = 0;
        System.out.println("Name \t\t Gross pay \t\t Net pay");
        for(int i = 0; i < clArray.length; i++){
            if(clArray[i].getHours() <= 40){
                grossPay = clArray[i].getHours() * clArray[i].getRate();
            }else{
                grossPay = (40 * clArray[i].getRate()) + (clArray[i].getHours() - 40) * (float)1.5 * clArray[i].getRate();
            }
            netPay = grossPay - grossPay * 7 / 100;
            sumNetSalary+= netPay;
            System.out.print(clArray[i].getName().trim() + "\t\t");
            System.out.print(grossPay + "\t\t\t");
            System.out.println(netPay);
        }
        System.out.println("\nThe mean of net pay is: " + sumNetSalary);

    }
}
