import java.util.*;

public class billrd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Long, Long> hm1 = new HashMap<>();
        Map<Long, Long> hm2 = new HashMap<>();
        int T = sc.nextInt();
        while (T-- > 0) {
            long n, k, x, y;
            n = sc.nextLong();
            k = sc.nextLong();
            x = sc.nextLong();
            y = sc.nextLong();
            if (x == y) {
                System.out.print(n + " " + n);
            } else if (x > y) {
                hm1.put(1L, x + n - y);
                hm2.put(1L, n);

                hm1.put(2L, n);
                hm2.put(2L, n - y + x);

                hm1.put(3L, y - x);
                hm2.put(3L, 0L);

                hm1.put(4L, 0L);
                hm2.put(4L, y - x);
            } else {
                hm1.put(1L, n);
                hm2.put(1L, y + n - x);

                hm1.put(2L, y + n - x);
                hm2.put(2L, n);

                hm1.put(3L, 0L);
                hm2.put(3L, x - y);

                hm1.put(4L, x - y);
                hm2.put(4L, 0L);
            }
            long a = hm1.get((Long) ((k - 1) % 4));
            long b = hm2.get((Long) ((k - 1) % 4));
            System.out.println(a + " " + b);

        }
        sc.close();
    }
}
