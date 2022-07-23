package ExCa;

/**
 *
 * @author aayus
 */
public class LogicalOperator {

    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;
        boolean d = a & b;
        boolean e = a && b;
        boolean f = a | b;
        boolean g = a || b;
        boolean h = !a;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        int a1 = 2;
        int a2 = 3;
        int a3 = 5;
        boolean i = ((a1 > a2) & (a1++ < a3));
        System.out.println(a1);
    }
}
