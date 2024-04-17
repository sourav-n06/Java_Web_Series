package Libery;
import java.util.*;
public class TransactionList {
    class Transaction{
        String memberId;
        String bookId;
        String transactionId;
        String status;
        static Random rand = new Random();

        public Transaction(String memberId, String bookId) {
            Integer i = 97345982+Transaction.rand.nextInt(100000);
            this.transactionId = i.toString();;
            this.memberId = memberId;
            this.bookId = bookId;
            this.status = "issued";
        }
    }

    Transaction[] transaction = new Transaction[100];
    int count = 0;

    public void issueBook(String memberId, String bookId) {
        transaction[count] = new Transaction(memberId, bookId);
        count++;
    }

    public void returnBook(String bookId,String memberId) {
        for (int i = 0; i < count; i++) {
            if (transaction[i].bookId.equals(bookId) && transaction[i].memberId.equals(memberId) && transaction[i].status == "issued") {
                transaction[i].status = "returned";
                System.out.println("Book returned");
                return;
            
            }
        }
    }

    public void displayAllTransactions() {
        for (int i = 0; i < count; i++) {
            System.out.println("\nransaction Id: "+transaction[i].transactionId );
            System.out.println("Member Id: "+transaction[i].memberId );
            System.out.println("Book Id: "+transaction[i].bookId );
            System.out.println("status: "+transaction[i].status );
        }
    }

    
}
