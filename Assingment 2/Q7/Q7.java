import java.util.*;

public class Q7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] str = sentence.split("[@. ]");
        int hsh[] = new int[5];
        boolean startWithThe = false;
        for(int i=0;i<str.length;i++){
            if(i==0 && str[i] == "The") startWithThe = true;  

            if(str[i].equals("a"))
                hsh[0]++;
            else if(str[i].equals("an"))
                hsh[1]++;
            else if(str[i].equals("the"))
                hsh[2]++;
            else if(str[i].equals("and"))
                hsh[3]++;
            else if(str[i].equals("or"))
                hsh[4]++;
        }
        
        System.out.println("Number of a: "+hsh[0]);
        System.out.println("Number of an: "+hsh[1]);
        System.out.println("Number of the: "+hsh[2]);
        System.out.println("Number of and: "+hsh[3]);
        System.out.println("Number of or: "+hsh[4]+"\n");

        char[] charArr = sentence.toCharArray();
        for(int i=0;i<charArr.length;i++){
            System.out.print(charArr[i]+" ");
        } 
        System.out.println("");



        System.out.println("tokens are: ");
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }

        System.out.println("Does the sentence starts wuth 'The': "+startWithThe);
        sc.close(); 
    }
}

