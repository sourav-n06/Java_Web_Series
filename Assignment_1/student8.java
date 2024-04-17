public class student8 {

    int roll;
    String name;
    double marks;

    public student8() {
        this.roll = 0;
        this.name = "";
        this.marks = 0.0;
    }
    public student8(int roll) {
        this.roll = roll;
        this.name = "";
        this.marks = 0.0;
    }
    public student8(int roll, String name) {
        this.roll = roll;
        this.name = name;
        this.marks = 0.0;
    }
    public student8(int roll, double marks) {
        this.roll = roll;
        this.name = "";
        this.marks = marks;
    }
    public student8(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public student8(student8 obj) {
        this.roll = obj.roll;
        this.name = obj.name;
        this.marks = obj.marks;
    }
    void display() {
        System.out.println("The Name is : " + name);
        System.out.println("The Roll is : " + roll);
        System.out.println("The Marks is : " + marks);
        System.out.println();
        System.out.println("-----------------END-----------------");
        System.out.println();
    }
    public static void main(String[] args) {
        student8 s1 = new student8();
        s1.display();
        student8 s2 = new student8(256);
        s2.display();
        student8 s3 = new student8(256, "Sourav Hazra");
        s3.display();
        student8 s4 = new student8(256, 89.5);
        s4.display();
        student8 s5 = new student8(256, "Sourav Hazra", 89.5);
        s5.display();
        student8 s6 = new student8(s5);
        System.out.println("====== Printing DEEP COPY ======");
        s6.name = "Binoy";        
        s6.display();

        s5.display();
    }
}
