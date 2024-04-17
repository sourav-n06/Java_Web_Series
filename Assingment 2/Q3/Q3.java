import java.util.Scanner;

import Libery.*;

class Q3 {

    public static void menu(Scanner sc){
        System.out.println("Enter 1 to add new book");
        System.out.println("Enter 2 to add new member");
        System.out.println("Enter 3 to issue book");
        System.out.println("Enter 4 to return book");
        System.out.println("Enter 5 Add more copies of a book");
        System.out.println("Enter 6 to increase or decrease number of copies available of a book in Libery");
        System.out.println("Enter 7 to display all books");
        System.out.println("Enter 8 to display all members");
        System.out.println("Enter 9 to show a particular book");
        System.out.println("Enter 10 to show a particular member");
        System.out.println("Enter 11 to print all transactions");
        System.out.println("Enter 12 to exit");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bl = new BookList();
        MemberList ml = new MemberList();
        TransactionList tl = new TransactionList();

        // Q3.menu(sc);
        
        while(true){
            Q3.menu(sc);
            System.out.println("\nEnter options");
            int options = sc.nextInt();sc.nextLine();


            switch (options) {
                case 1:
                    System.out.println("Enter book name");
                    String name = sc.nextLine();
                    System.out.println("Enter bookId");
                    String bookId = sc.nextLine();
                    System.out.println("Enter number of copies Purchased");
                    int copiesPurchased = sc.nextInt();sc.nextLine();
                    System.out.println("Enter number of copies Available");
                    int copiesAvailable = sc.nextInt();sc.nextLine();

                    if(copiesPurchased < copiesAvailable){
                        System.out.println("Copies available cannot be less than copies purchased so enter again");
                        break;
                    }
                    
                    bl.addNewBook(name, bookId, copiesPurchased, copiesAvailable);

                    break;
                case 2:
                    System.out.println("Enter member name");
                    String memberName = sc.nextLine();
                    System.out.println("Enter memberId");
                    String memberId = sc.nextLine();
                    System.out.println("Enter member DOB");
                    String DOB = sc.nextLine();
                    System.out.println("Enter number of books issued");
                    int booksIssued = sc.nextInt();sc.nextLine();
                    ml.addNewMember(memberId, memberName, DOB, booksIssued);
                    break;
                case 3:

                    System.out.println("Enter bookId");
                    bookId = sc.nextLine();
                    System.out.println("Enter memberId");
                    memberId = sc.nextLine();
                    if(ml.checkMemberStatus(memberId) == false){
                        System.out.println("Member is not available");
                        break;
                    }
                    if(bl.checkBookStatus(bookId) == false){
                        System.out.println("Book is not available");
                        break;
                    }
                    tl.issueBook(memberId, bookId);
                    bl.issueBook(bookId);
                    ml.issueBook(memberId);

                    
                    break;
                case 4:
                    System.out.println("Enter bookId");
                    bookId = sc.nextLine();
                    System.out.println("Enter memberId");
                    memberId = sc.nextLine();
                    tl.returnBook(bookId,memberId);
                    bl.returnBook(bookId);
                    ml.returnBook(memberId);
                    
                    break;
                case 5:
                    System.out.println("Enter bookId");
                    String bookId1 = sc.nextLine();
                    System.out.println("Enter number of copies");
                    int copies = sc.nextInt();sc.nextLine();
                    bl.addMoreCopies(bookId1,copies);
                    break;

                case 6:
                    System.out.println("Enter 1 to change number of copies available");
                    System.out.println("Enter 2 to change number of copies purchased");
                    int choice = sc.nextInt();sc.nextLine();

                    System.out.println("Enter 1 to increase and 2 to decrease");
                    int choice1 = sc.nextInt();sc.nextLine();

                    System.out.println("Enter bookId");
                    bookId = sc.nextLine();
                    System.out.println("Enter number of copies");
                    copies = sc.nextInt();sc.nextLine();

                    if(choice ==1 && choice1 == 1){
                        bl.increaseCopiesAvailable(bookId,copies);
                    }
                    else if( choice ==1 &&choice1 == 2){
                        bl.decreaseCopiesAvailable(bookId,copies);
                    }
                    else if (choice ==2 && choice1 == 1){
                        bl.increaseCopiesPurchased(bookId,copies);
                    }
                    else if(choice ==2 && choice1 == 2){
                        bl.decreaseCopiesPurchased(bookId,copies);
                    }
                    break;
                case 7:
                    bl.displayAllBooks();
                    break;
                case 8:
                    ml.displayAllMembers();
                    break;
                case 9:

                    System.out.println("Enter bookId");
                    bookId = sc.nextLine();
                    bl.showParticularBook(bookId);
                    break;

                case 10:
                    System.out.println("Enter memberId");
                    memberId = sc.nextLine();
                    ml.displayParticularMember(memberId);
                    break;

                case 11:
                    tl.displayAllTransactions();
                    break;
                
                case 12:
                    System.out.println("Thank you");
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
        }


    }    
}
