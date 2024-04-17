package Libery;

public class TransactionList {
    class Transaction{
        String memberId;
        String bookId;
        String status;

        public Transaction(String memberId, String bookId) {
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
            if (transaction[i].bookId.equals(bookId) && transaction[i].memberId.equals(memberId)) {
                transaction[i].status = "returned";
                System.out.println("Book returned");
                return;
            
            }
        }
    }

    public void displayAllTransactions() {
        for (int i = 0; i < count; i++) {
            System.out.println("\nMember Id: "+transaction[i].memberId );
            System.out.println("Book Id: "+transaction[i].bookId );
            System.out.println("status: "+transaction[i].status );
        }
    }

    
}
