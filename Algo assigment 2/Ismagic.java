import java.util.*;

public class Ismagic {
    static int magic(int num) {
        if (num == 0) {
            return num;
        }
        int val = 0;
        while (num != 0) {
            val += num % 10;
            num /= 10;
        }
        if (val > 0 && val <= 9) {
            return val;
        } else {
            val = magic(val);
        }
        return val;
    }

    public static void main(String[] args) {
        int n, z;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        z = magic(n);
        if (z == 1) {
            System.out.println("The " + n + " is magic number = " + z);
        } else {
            System.out.println("The " + n + " is not a magic number = " + z);
        }
    }
}
