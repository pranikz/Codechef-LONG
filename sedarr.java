import java.util.*;
import java.math.*;

public class sedarr {
    public static void main(String[] args) {
        int t, n, k;

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            n = sc.nextInt();
            k = sc.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[i] = sc.nextInt();
            }
            int sum = 0, add = 0, op = 0;

            for (int j = 0; j < n; j++) {
                sum = sum + a[i];
            }
            if (sum % k == 0) {
                System.out.println(op);
                break;
            } else {
                add++;
                a[add] = sum;
            }

        }
    }
}
