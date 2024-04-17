import java.util.Scanner;

class Instructor {
    String name;
    int ph;

    void setInstuctor(String name, int ph) {
        this.name = name;
        this.ph = ph;
    }

    void displayInstuctor() {
        System.out.println(".............Instuctor..............");
        System.out.println("\n\nThe Name is : " + name);
        System.out.println("The Phone Number is : " + ph);
    }
}

class TextBook {
    String title;
    String author;
    String publisher;

    void setTextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    void displayTextBook() {
        System.out.println("...........Text Book...........");
        System.out.println("\n\nThe Title is : " + title);
        System.out.println("The Author is : " + author);
        System.out.println("The Publisher is : " + publisher);
    }
}

class Course {
    String name;
    String instructor;
    String textbook;

    void setCourse(String name, String instructor, String textbook) {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    void displayCourse() {
        System.out.println("\n...............Course.............. ");
        System.out.println("\n\nThe Name is : " + name);
        System.out.println("The Instructor is : " + instructor);
        System.out.println("The Textbook is : " + textbook);
    }
}

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Set Instructor
        Instructor ins = new Instructor();
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Phone Number : ");
        int ph = sc.nextInt();
        ins.setInstuctor(name, ph);
        ins.displayInstuctor();

        // Set Textbook
        System.out.println("Enter Title : ");
        String title = sc.nextLine();
        System.out.println("Enter Author : ");
        String author = sc.nextLine();
        System.out.println("Enter Publisher : ");
        String publisher = sc.nextLine();
        TextBook book = new TextBook();
        book.setTextBook(title, author, publisher);
        book.displayTextBook();

        // Set Course
        System.out.println("Enter Course Name : ");
        String name1 = sc.nextLine();
        System.out.println("Enter Instructor Name : ");
        String instructor1 = sc.nextLine();
        System.out.println("Enter Textbook Name : ");
        String textbook1 = sc.nextLine();
        Course course = new Course();
        course.setCourse(name1, instructor1, textbook1);
        course.displayCourse();
    }
}
