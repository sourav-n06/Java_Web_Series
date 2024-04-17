import java.util.Scanner;

public class Q4 {

    public static void menu() {
        System.out.println("Enter 1 to add new book");
        System.out.println("Enter 2 to add new member");
        System.out.println("Enter 3 to issue book");
        System.out.println("Enter 4 to return book");
        System.out.println("Enter 5 to show a particular book");
        System.out.println("Enter 6 to show a particular member");
        System.out.println("Enter 7 to display all books");
        System.out.println("Enter 8 to display all members");
        System.out.println("Enter 9 to exit");
        System.out.println("Enter your choice");
    }

    public static void main(String[] args) {
        LibraryInterface l = new Library();
        // Q4.menu();
        Scanner sc = new Scanner(System.in);
        int choice ;
        // = sc.nextInt();
        // sc.nextLine();
        do {
            Q4.menu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    l.addBook(sc);
                    break;
                case 2:
                    l.addMember(sc);
                    break;
                case 3:
                    l.issueBook(sc);
                    break;
                case 4:
                    l.returnBook(sc);
                    break;
                case 5:
                    l.searchBook(sc);
                    break;
                case 6:
                    l.searchMember(sc);
                    break;
                case 7:
                    l.viewAllBooks(sc);
                    break;
                case 8:
                    l.viewAllMembers(sc);
                    break;
                case 9:
                    System.out.println("Thank you");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 12);

        sc.close();
    }
}