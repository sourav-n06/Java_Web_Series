import java.util.*;


public class AS02 {
    public static void main(String[] args) {
        System.out.println("Number of Argument :"+ args.length);
        System.out.println("Command line parameters");
        for (int i=0;i<args.length;i++){
            System.out.println("Parameter "+(i+1)+" is "+ args[i]);
        }
    }
}