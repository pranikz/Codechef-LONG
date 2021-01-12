import java.util.*;

public class billrd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long n, k, x, y;
            n = sc.nextLong();
            k = sc.nextLong();
            x = sc.nextLong();
            y = sc.nextLong();
            if (x == y) {
                x = n;
                y = n;
            } else if (x > y) {
                k = k % 4;
                if (k == 0) {
                    x = x - y;
                    y = 0;
                } else if (k == 1) {
                    y = n + y - x;
                    x = n;
                } else if (k == 2) {
                    x = n + y - x;
                    y = n;
                } else if (k == 3) {
                    y = x - y;
                    x = 0;
                }
            } else {
                k = k % 4;
                if (k == 0) {
                    y = y - x;
                    x = 0;
                } else if (k == 1) {
                    x = n + x - y;
                    y = n;
                } else if (k == 2) {
                    y = n + x - y;
                    x = n;
                } else if (k == 3) {
                    x = y - x;
                    y = 0;
                }
            }

            System.out.println(x + " " + y);

        }
        sc.close();
    }
}
