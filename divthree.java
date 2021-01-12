import java.util.Scanner;

public class divthree {

    public static void main(String[] args) {
        try {
            int T;
            Scanner sc = new Scanner(System.in);
            T = sc.nextInt();
            while (T >= 1) {
                int K, D;
                int N = sc.nextInt();
                K = sc.nextInt();
                D = sc.nextInt();
                long sum = 0;
                int a;
                for (int j = 1; j <= N; j++) {
                    a = sc.nextInt();
                    sum += a;
                }
                T--;
                System.out.println(Math.min(sum / K, D));
            }
        } catch (Exception e) {
        }

    }
}
