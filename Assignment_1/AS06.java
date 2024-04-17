public class AS06 {
    void show(int x) {
        System.out.println("OUTPUT FROM void show(int x)"+x);
    }
    void show(double x) {
        System.out.println(" OUTPUT FROM void show(double x) "+x);
    }
    public static void main(String[] args) {
        AS06 as06 = new AS06();
        short x1 = 12;
        double x2 = 125.555666;

        as06.show(x1); //Short 
        as06.show(x2); //double
    }
}
