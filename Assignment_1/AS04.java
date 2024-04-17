import java.util.*;
public class AS04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int rad=sc.nextInt();
        double pi=3.14;
        double area=pi*rad*rad;
        System.out.println("Area is:" +area);
    }
}
