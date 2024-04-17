
//import java.util.*;

public class Q6
{
    public static void main(String args[])
    {
        int m=5;
        Integer i=m;  // 1.basic to object
        System.out.println("Type of i: "+i.getClass().getSimpleName());

        int n=6;
        n=i;  //2.object to basic
        System.out.println("Type of n: "+((Object)n).getClass().getSimpleName());
        
        String z=Integer.toString(m); //basic to string
        System.out.println("Type of z: "+((Object)z).getClass().getSimpleName());
        
        String y="100";
        Integer p=Integer.valueOf(y); //string to integer
        System.out.println("Type of p: "+((Object)p).getClass().getSimpleName());
        
        String x=Integer.toString(i); //object to string
        System.out.println("Type of x: "+((Object)x).getClass().getSimpleName());
    }
}