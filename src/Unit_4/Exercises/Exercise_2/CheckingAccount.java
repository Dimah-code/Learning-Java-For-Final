public class CheckingAccount {
    private int accountNO;
    private int balance;
    private double minBalance = 200.0;
    CheckingAccount(int NO, int bal){
        accountNO = NO;
        balance = bal;
    }
    public void display(){
        System.out.println("Account NO: " + accountNO);
        System.out.println("Account Balance: " + balance);
        System.out.println("Minimum Balance: " + minBalance);
    }
}
