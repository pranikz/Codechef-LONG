import java.util.Scanner;

public class decodeit {

    public static void main(String[] args) {
        try {
            char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p' };
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                String S = sc.next();
                StringBuffer sol = new StringBuffer();
                for (int i = 0; i <= n - 3; i += 4) {
                    sol.append(ch[Integer.parseInt(S.substring(i, i + 4), 2)]);

                }
                System.out.println(sol);
            }
        } catch (Exception e) {
        }
    }
}
