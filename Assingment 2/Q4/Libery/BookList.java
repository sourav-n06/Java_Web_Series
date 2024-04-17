package Libery;

public class BookList {
    /**
     * InnerBookList
     */
    public class Book {
        String bookId;
        String name;
        int copiesPurchased;
        int copiesAvailable;
        
        public Book(String bookId, String name,int copiesAvailable,int copiesPurchased) {
            this.bookId = bookId;
            this.name = name;
            this.copiesPurchased = copiesPurchased;
            this.copiesAvailable = copiesAvailable;
        }

        
        
        
        
        public void display() {
            System.out.println("Book ID: " + bookId);
            System.out.println("Book Name: " + name);
            System.out.println("Copies Available: " + copiesAvailable);
            System.out.println("Copies Purchased: " + copiesPurchased+"\n");
        }
    }
        
    private Book[] bookList = new Book[100];
    private int count = 0;//also points to next empty location to store book
         
    public void addNewBook(String name,String bookId,int copiesAvailable,int copiesPurchased) {
         for(int i=0;i<count;i++) {
             if(bookList[i].bookId.equals(bookId)) {
                 System.out.println("Book already exists");
                 return;
                }
            }
            bookList[count] = new Book(bookId,name,copiesAvailable,copiesPurchased);
            count++;
    }
            
    public void addMoreCopies(String bookId,int copies) {
        for(int i=0;i<count;i++) {
            if(bookList[i].bookId.equals(bookId)) {
                bookList[i].copiesAvailable+=copies;
                bookList[i].copiesPurchased+=copies;
                return;
            }
        }
        
        System.out.println("Book not found");
    }
            
    public void displayAllBooks(){
            if(count==0){
                System.out.println("No books available");
                return;
            }
            
            System.out.println("Total books: "+count);
            for(int i=0;i<count;i++) {
                bookList[i].display();
            }
    }
                
    public void showParticularBook(String bookId){
        for(int i=0;i<count;i++){
            if(bookList[i].bookId.equals(bookId)){
                bookList[i].display();
                return;
            }
        }
        System.out.println("Book not found");
    }
                    
    public void changeBookPurchaserCount(String bookId,int count){
        for(int i=0;i<count;i++){
            if(bookList[i].bookId.equals(bookId)){
                bookList[i].copiesPurchased = count;
                return;
            }
        }
    }
    
    public void changeBookAvailableCount(String bookId,int count){
        for(int i=0;i<count;i++){
            if(bookList[i].bookId.equals(bookId)){
                bookList[i].copiesAvailable = count;
                return;
            }
        }
    }
    
    
    public boolean checkBookStatus(String bookId){
        for(int i=0;i<count;i++){
            if(bookList[i].bookId.equals(bookId)){
                if(bookList[i].copiesAvailable >0)
                return true;
                else return false;
            }
        }
        return false;
    }
    
    public void issueBook(String bookId){
        for(int i=0;i<count;i++){
            if(bookList[i].bookId.equals(bookId)){
                bookList[i].copiesAvailable-=1;
                return;
            }
            }
        }
        
    public void returnBook(String bookId){
        for(int i=0;i<count;i++){
            if(bookList[i].bookId.equals(bookId)){
                bookList[i].copiesAvailable+=1;
                 return;
                }
            }   
    }
        
    public void increaseCopiesAvailable(String bookId, int inc) {
        for(int i=0;i<count;i++){
            if(bookList[i].bookId.equals(bookId)){
                if(bookList[i].copiesAvailable+inc>=bookList[i].copiesPurchased)
                    System.out.println("Not enough copies purchased");
                else if(bookList[i].copiesAvailable+inc<=bookList[i].copiesPurchased)
                    bookList[i].copiesAvailable+=inc;

                return;
            }
        }   
        System.out.println("Book not found");
        
    }
            
    public void decreaseCopiesAvailable(String bookId, int dec) {
            for(int i=0;i<count;i++){
                if(bookList[i].bookId.equals(bookId)){
                    if(bookList[i].copiesAvailable>=dec)
                    bookList[i].copiesAvailable-=dec;
                    else System.out.println("Not enough copies available");
                    return;
                }
            }    
            System.out.println("Book not found");
        }
        
    public void increaseCopiesPurchased(String bookId, int inc) {
        for(int i=0;i<count;i++){
            if(bookList[i].bookId.equals(bookId)){
                bookList[i].copiesPurchased+=inc;
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void decreaseCopiesPurchased(String bookId, int dec) {
        for(int i=0;i<count;i++){
            if(bookList[i].bookId.equals(bookId)){
                if(bookList[i].copiesPurchased>=dec)
                bookList[i].copiesPurchased-=dec;
                else System.out.println("Not enough copies purchased");
                return;
            }
        }
        System.out.println("Book not found");
    }
}