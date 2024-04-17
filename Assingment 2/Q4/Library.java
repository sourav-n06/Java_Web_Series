import java.util.Scanner;

public class Library implements LibraryInterface {
    public void addBook(Scanner sc) {
        System.out.println("Enter book name");
        String name = sc.nextLine();
        System.out.println("Enter bookId");
        String bookId = sc.nextLine();
        System.out.println("Enter number of copies Purchased");
        int copiesPurchased = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter number of copies Available");
        int copiesAvailable = sc.nextInt();
        sc.nextLine();

        if (copiesPurchased < copiesAvailable) {
            System.out.println("Copies available cannot be less than copies purchased so enter again");
            return;
        }

        bl.addNewBook(name, bookId, copiesPurchased, copiesAvailable);
    }

    public void searchBook(Scanner sc) {
        String bookId;
        System.out.println("Enter bookId");
        bookId = sc.nextLine();
        bl.showParticularBook(bookId);
    }

    public void viewAllBooks(Scanner sc) {
        bl.displayAllBooks();
    }

    public void addMember(Scanner sc) {
        System.out.println("Enter member name");
        String memberName = sc.nextLine();
        System.out.println("Enter memberId");
        String memberId = sc.nextLine();
        System.out.println("Enter member DOB");
        String DOB = sc.nextLine();
        System.out.println("Enter number of books issued");
        int booksIssued = sc.nextInt();
        sc.nextLine();
        ml.addNewMember(memberId, memberName, DOB, booksIssued);
    }

    public void searchMember(Scanner sc) {
        String memberId;
        System.out.println("Enter memberId");
        memberId = sc.nextLine();
        ml.displayParticularMember(memberId);
    }

    public void viewAllMembers(Scanner sc) {
        ml.displayAllMembers();
    }

    public void issueBook(Scanner sc) {
        String bookId;
        System.out.println("Enter bookId");
        bookId = sc.nextLine();
        String memberId;
        System.out.println("Enter memberId");
        memberId = sc.nextLine();
        if (ml.checkMemberStatus(memberId) == false) {
            System.out.println("Member is not available");
            return;
        }
        if (bl.checkBookStatus(bookId) == false) {
            System.out.println("Book is not available");
            return;
        }
        tl.issueBook(bookId, memberId);
        bl.issueBook(bookId);
        ml.issueBook(memberId);
    }

    public void returnBook(Scanner sc) {
        String bookId;
        System.out.println("Enter bookId");
        bookId = sc.nextLine();
        String memberId;
        System.out.println("Enter memberId");
        memberId = sc.nextLine();
        tl.returnBook(bookId, memberId);
        bl.returnBook(bookId);
        ml.returnBook(memberId);
    }
}
