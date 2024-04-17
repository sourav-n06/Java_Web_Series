import java.util.*;
public class AS03 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height in cm");
        int height=sc.nextInt();
        int f=(int)(height/30.5);
        double i=(height-f*30.5)/2.54;
        System.out.println("Height in foot and inches:"+f+"foot "+i+"inches");
        sc.close();
    }
}
