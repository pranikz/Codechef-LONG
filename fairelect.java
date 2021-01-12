import java.util.*;

public class fairelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int a[] = new int[n];
            int counter = 0;
            Integer b[] = new Integer[m];
            long sum_a = 0, sum_b = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum_a += a[i];
            }

            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
                sum_b += b[j];
            }
            Arrays.sort(a);
            Arrays.sort(b, Comparator.reverseOrder());
            if (sum_a > sum_b) {
                System.out.print("0");
                continue;
            } else {
                for (int i = 0; i < n; i++) {
                    int temp = a[i];
                    a[i] = b[i];
                    b[i] = temp;
                    sum_a = sum_a - b[i] + a[i];
                    sum_b = sum_b - a[i] + b[i];
                    counter++;
                    if (sum_a > sum_b)
                        break;
                }
            }
            if (sum_a > sum_b)
                System.out.println(counter);
            else
                System.out.println("-1");

        }
        sc.close();
    }
}
