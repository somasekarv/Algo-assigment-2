import java.util.*;
import java.lang.*;

public class mplementPowerFunction {
    static int powers(int x, int y, int z) {
        int z1 = (int) Math.pow(x, y) % z;
        return z1;
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("The power of a,b and c are = " + powers(a, b, c));
    }
}