package ExCa;

/**
 *
 * @author aayus
 */
import java.util.Scanner;
public class ifelse {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        
        if(age<=19){
            System.out.println("you are a teen");
        }
        else if(age>19&age<=50){
            System.out.println("you are adult");
        }
        else{
            System.out.println("you are old");
        }
        
        
//        if(age<=14){
//            System.out.println("you are still a child");
//        }
//        else{
//            System.out.println("you are grown up");
//        }
        System.out.println("Have a good day");
    }
}
