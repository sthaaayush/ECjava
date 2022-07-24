package ExCa;

/**
 *
 * @author aayus
 */
import java.util.Scanner;

public class switchcase {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a choice\n1.print odd no from 1-n\n2.print even no from 1-n");
//        int a = sc.nextInt();
//        System.out.println("Enter n:");
//        int b = sc.nextInt();
//        switch (a) {
//            case 1:{
//                System.out.println("\nOdd Number:");
//                for (int i = 1; i <= b; i++) {
//                    if (i % 2 != 0) {
//                        System.out.println(i);
//                    }
//                }
//                break;
//            }
//                
//
//            case 2:{
//                System.out.println("\nEven Number:");
//                for (int i = 1; i <= b; i++) {
//                    if (i % 2 == 0) {
//                        System.out.println(i);
//                    }
//                }
//                break;
//            }
//                
//
//            default:{
//                System.out.println("Invalid input");
//                break;
//            }         
//        }
/*switch based program to do following:
i.get info of rectangle
ii. get info of circle
iii. get info of square
take a choice from above enur. if user inputs 
         */

        System.out.println("Enter:\n1.Rectangle\n2.Circle\n3.Square");
        int cs = sc.nextInt();
        switch (cs) {
            case 1: {
                System.out.println("Enter:\n1.Area\n2.Perimeter");
                int r = sc.nextInt();
                System.out.println("Enter length and bredth:");
                int l = sc.nextInt();
                int b = sc.nextInt();
                switch (r) {
                    case 1: {
                        System.out.println("Area of rectangle=" + (l * b));
                        break;
                    }
                    case 2: {
                        System.out.println("Perimeter of Rectangle=" + (2 * (l + b)));
                        break;
                    }
                    default: {
                        System.out.println("Invalid input");
                        break;
                    }
                }
                break;
            }

            case 2: {
                System.out.println("Enter:\n1.Area\n2.Circumference");
                int c=sc.nextInt();
                System.out.println("Enter radius:");
                int r=sc.nextInt();
                final double pi=3.14;
                switch(c){
                    case 1:{
                        System.out.println("Area of circle="+(pi*r*r));
                        break;
                    }
                    case 2:{
                        System.out.println("Circumference of circle="+(2*pi*r));
                        break;
                    }
                    default: {
                        System.out.println("Invalid input");
                            break;
                    }
                }
                break;
            }
            case 3:{
                System.out.println("Enter:\n1.Area\n2.Perimeter");
                int sq=sc.nextInt();
                System.out.println("Enter length:");
                int l1=sc.nextInt();
                switch(sq){
                    case 1:{
                        System.out.println("Area of Square="+(l1*l1));
                        break;
                    }
                    case 2:{
                        System.out.println("Perimeter of Square="+(4*l1));
                        break;
                    }
                    default: {
                        System.out.println("Invalid input");
                            break;
                    }
                }
                break;
            }
        }
    }
}
