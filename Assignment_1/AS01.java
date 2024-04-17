import java.util.Scanner;
public class AS01{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 short integers");
        System.out.println("Enter First Number :");
        short n1=scanner.nextShort();
        System.out.println("Enter Second Number :");
        short n2=scanner.nextShort();
        short sum=(short)(n1+n2);
        System.out.print("Sum:"+sum);
        scanner.close();
    }
}