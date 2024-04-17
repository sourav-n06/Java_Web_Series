public class Q07 {
    String name;
    int roll;
    double marks;
    
    void set(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void display(){
        System.out.println("The Name is : " + name);
        System.out.println("The Roll is : " + roll);
        System.out.println("The Marks is : " + marks);
    }

    void copy(Q07 obj){
        this.name = obj.name;
        this.roll = obj.roll;
        this.marks = obj.marks;
    }

    public static void main(String[] args) {
        Q07 obj1 = new Q07();
        obj1.set("Sourav", 1, 89.5);
        Q07 obj2 = new Q07();
        obj2.copy(obj1);
        obj2.display();
        obj1 = obj2;
    }
}
