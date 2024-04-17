import java.util.Scanner;

class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        

    }
}

class Customer {
    int Id;
    String name;
    String phNo;
    int currLoan;
    private static int creditLimit = 30000;
    private static int baseId = 5684;

    Customer() {
        name = "";
        phNo = "";
        currLoan = 0;
        Id = baseId + (int) (Math.random() * 1000);
    }

    void setName(String name) {
        this.name = name;
    }

    void setPhNumber(String PhNo) {
        this.phNo = PhNo;
    }

    void takeLoan(int loan) {
        if (loan + this.currLoan > creditLimit) {
            System.out.println("this amount of loan cant be granted");
        } else {
            this.currLoan += loan;
            System.out.println("loan has been granted");
        }
    }

    int showCreditLimit() {
        System.out.println(creditLimit);
        return creditLimit;
    }

    int currentLoan() {
        System.out.println("Current loan: " + this.currLoan);
        return this.currLoan;
    }

    int possibleLoan() {
        System.out.println("max possible lone ypu can seek is: " + (creditLimit - currLoan));
        return creditLimit - currLoan;
    }

}

class PreviligedCustomer extends Customer {
    public static int creditLimit = 600000;
}
