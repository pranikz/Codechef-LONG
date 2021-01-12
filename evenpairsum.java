

import java.util.*;
public class evenpairsum {

    public static void main(String[] args) {
        long T,a,b,p;
        p=0;
        Scanner sc = new Scanner(System.in);
        for ( T = sc.nextLong() ; T >0; T--) 
        {
            a=sc.nextLong();
            b=sc.nextLong();
            long e1=a/2;
            long o1= a-e1;
            long e2=b/2;
            long o2=b-e2;
            p=e1*e2+o1*o2;
            System.out.println(p);

        
    }
}
}