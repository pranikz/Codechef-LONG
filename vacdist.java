import java.util.Scanner;
import java.math.*;
public class vacdist {

    public static void main(String[] args) {
        long T,d;
        int n;
        Scanner sc = new Scanner(System.in);
        for ( T = sc.nextLong() ; T >0; T--) 
        {
            n=sc.nextInt();
            d=sc.nextLong();
            long []a= new long[n];
            long risk=0, norisk=0;
            for(int i=0;i<n;i++)

    	{

    		a[i]=sc.nextLong();

    		if(a[i]>=80||a[i]<=9)

    		risk++;

    		else

    		norisk++;

        }
        long sum = (long) (Math.ceil((double) risk / (double) d) + Math.ceil((double) norisk / (double) d));

        System.out.println(sum);
    }
    }
}