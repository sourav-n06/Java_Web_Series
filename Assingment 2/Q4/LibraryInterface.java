import java.util.Scanner;

import Libery.BookList;
import Libery.MemberList;
import Libery.TransactionList;
// import Library.*;

/**
 * Libreary
 */
public interface LibraryInterface {

    final static BookList bl = new BookList();
    final static MemberList ml = new MemberList();
    final static TransactionList tl = new TransactionList();

    public void addBook(Scanner sc);

    public void searchBook(Scanner sc);

    public void viewAllBooks(Scanner sc);

    public void addMember(Scanner sc);

    public void searchMember(Scanner sc);

    public void viewAllMembers(Scanner sc);

    public void issueBook(Scanner sc);

    public void returnBook(Scanner sc);

}
