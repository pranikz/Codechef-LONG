/**
 * attendu
 */
import java.util.*;
public class attendu {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        int N;
        String B=null;
        int f=0;
        double p=0.0;
        for (int i = 0; i < T; i++) {
            N=sc.nextInt();
            sc.nextLine();
            B=sc.nextLine();
             
            for (int j = 0; j < B.length(); j++) {
                char ch=B.charAt(j);
                if(ch=='1')
                {
                    f++;
                }
            }
                N = N-f;
                N = 120-N;
                p=(N*100)/120.0;
                if(p<75.00){
                    System.out.println("NO");
                }   
                else{
                    System.out.println("YES"); 
                }
    
        }
    }
}