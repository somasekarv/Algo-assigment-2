import java.lang.*;
import java.util.*;

class graycode {

    static void Grey(int n) {

        for (int i = 0; i < (1 << n); i++) {
            int val = (i ^ (i >> 1));
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Grey(n);
    }
}
