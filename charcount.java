package ExCa;

/**
 *
 * @author aayus
 */
import java.util.Scanner;

public class charcount {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

//        absoluter of given number
//        int a;
//        System.out.println("Enter integer:");
//        a=sc.nextInt();
//        if(a<0){
//            a*=-1;
//        }
//        System.out.println("Absolute of given number="+a);
//        roundoff farctional number such that if decimal no is greater that .5 then ceiling else floor
//        System.out.println("Enter fractiona num:");
//        double fc;
//        fc=sc.nextDouble();
//        double a=fc-(int)fc;
//        if(a>0.5){
//            fc=(int)fc+1;
//        }
//        else{
//            fc=(int)fc;
//        }
//        System.out.println("Roundoff ="+fc);
//        Convert>>>>>>>>
//
//        System.out.println("1. feet to inches\n2. kg to grams");
//        int a=sc.nextInt();
//        switch(a){
//            case 1:
//                System.out.println("Enter feet value:");
//                int f=sc.nextInt();
//                System.out.println((f*12)+" Inches");
//                break;
//            case 2:
//                System.out.println("Enter kg value:");
//                int k=sc.nextInt();
//                System.out.println((k*1000)+" Grams");
//                break;
//            default:
//                System.out.println("Invalid input");
//        }
//        count character in string
//        System.out.println("Enter the string:");
//        char s[]=new char[65536];
//        for(int i=0;i<s.length ;i++)
//        {
//            s[i]=sc.next();
//        }
        String s = "My name is Aayush. My email is something@something.com";
        int c_count[] = new int[Character.MAX_VALUE];

        for(int i=0;i<s.length();i++)
        {
            c_count[(int)s.charAt(i)]++;
        }
        
//        char[] cfroms = s.toCharArray();        
//        for (int i = 0; i < cfroms.length; i++) 
//        {
//            c_count[(int)cfroms[i]]++;
//        }

        for (int i = 0; i < c_count.length; i++) 
        {
            if (c_count[i] != 0) {
                System.out.println((char) i + "->" + c_count[i]);
            }
        }
    }
}
