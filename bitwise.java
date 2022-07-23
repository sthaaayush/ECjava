package ExCa;

/**
 *
 * @author aayus
 */
//Bitwise Operation
public class bitwise {
    public static void main(String args[]) {
        int a=10;//1010
        int b=5;//0101
        int c=a&b;//0000
        System.out.println(c);
        int d=a|b;//1111
        System.out.println(d);
        int e=a^b;//1111
        System.out.println(e);
        int f=a>>3;
        System.out.println(f);
        int g=a<<3;
        System.out.println(g);
    }
}
