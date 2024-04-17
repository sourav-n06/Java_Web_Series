import java.util.*;
public class AS05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String :");
        String first = sc.nextLine();
        String second = first;

        String third, fourth;

        System.out.println("Enter second String :");
        third = sc.nextLine();
        System.out.println("Enter Third String :");
        fourth = sc.nextLine();
        boolean isEqual1 = first == third;

        System.out.println("String Checking With == Operator (third and forth):"+ isEqual1);
        boolean isEqual2 = second.equals(fourth);
        System.out.println("String Checking Without == Operator (third and forth) :"+ isEqual2);
    }
}
