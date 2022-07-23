package ExCa;

/**
 *
 * @author aayus
 */
import java.util.Scanner;

public class cw2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       //bitwise operation AND, OR and XOR
       int a = 50, b = 30;
       System.out.println("AND=" + (a & b) + "\nOR=" + (a | b) + "\nXOR=" + (a ^ b));

       
       
       //salary of rs.15000 and 1500 bonus on each product calculate the total salary
       System.out.println("Enter the product sold:");
       int sales = sc.nextInt();
       System.out.println("Total salary=" + (15000 + (sales * 1500)));

       
       
       //if a1 is greater returns (a1+b1) if b1 is greater returns (b1-a1)"Using Ternary Operator"
       System.out.println("Enter two number:");
       int a1 = sc.nextInt();
       int b1 = sc.nextInt();
       if (a1 > b1) {
           System.out.println("a1+b1=" + (a1 + b1));
       } else {
           System.out.println("b1-a1=" + (b1 - a1));
       }

       
       
       //greatest between three number using conditional operator
       System.out.println("Enter three number to find greatest:");
       int a2 = sc.nextInt();
       int b2 = sc.nextInt();
       int c2 = sc.nextInt();
       int max = a2 > b2 ? (a2 > c2 ? a2 : c2) : (b2 > c2 ? b2 : c2);
       System.out.println("Maximum no=" + max);

       
       
       //middle between three number
       System.out.println("Enter three number to find middle:");
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       int num3 = sc.nextInt();
       if (num2 > num1 && num1 > num3 || num3 > num1 && num1 > num2) {
           System.out.print(num1 + "is a middle number");
       }
       
       else if (num1 > num2 && num2 > num3 || num3 > num2 && num2 > num1) {
           System.out.print(num2 + "is a middle number");
       }
       
       else {
           System.out.print(num3 + "is a middle number");
       }
       
       
       
        //a)sum of digits of entered number b)sum of even digits c)count number of digits
        System.out.println("Enter two or more digited number:");
        int dg=sc.nextInt(),sum=0,count=0,sumE=0;
        for(;dg!=0;)
        {
            int rem=dg%10;
            sum+=rem;
            if(rem%2==0){
                sumE+=rem;
            }
            dg/=10;
            count++;
        }
        System.out.println("Sum of digit="+sum);
        System.out.println("Sum of even digits="+sumE);
        System.out.println("Number of digits="+count);
    }
}
