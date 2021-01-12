import java.util.*;

public class onezeroswaps {
    public static void main(String[] args) {
        int t,n;
        String s,p;

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            n=sc.nextInt();
            sc.nextLine();
            s=sc.nextLine();
            p=sc.nextLine();
            int x=0,y;
            for (int j = 0; j <n ; j++) {
                if (s.charAt(i)=='0') {
                    x++;
                }                        
            }
            y= n-x;



            
        }
    }

}
