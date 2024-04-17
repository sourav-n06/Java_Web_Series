import java.util.*;
public class BankAcct {
    int accNumber;
    static float interestRate = 6.2f;
    double balance;

    BankAcct(int accNumber,double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    void changeInterestRate(float interestRate) {
        System.out.println("---------------- Processing ----------------------------");
        System.out.println("Interest Rate Change : from  " +BankAcct.interestRate +" to " +  interestRate);
        BankAcct.interestRate = interestRate;
        System.out.println("---------------- Interest Rate Changed ----------------------------");
    }
    void displayInterestRate() { 
        System.out.println("Interest Rate is :  "+ BankAcct.interestRate);
    }

    double returnBalance() {
        return this.balance;
    }
    void calculateInterestRate() {
        System.out.println("Your Interest : " +this.balance*interestRate/100);
    }
    public static void main(String[] args) {
        System.out.println("ENTER ACC NUMBER : ");
        Scanner sc = new Scanner(System.in);
        int acc = sc.nextInt();

        System.out.println("ENTER BALANCE : ");
        double bal = sc.nextFloat();
        BankAcct obj = new BankAcct(acc,bal);
        obj.displayInterestRate();
        obj.calculateInterestRate();
        obj.changeInterestRate(6.5f);
        System.out.println("Balance : " +obj.returnBalance());
        System.out.println("---------------- End ----------------------------");
    }
}
