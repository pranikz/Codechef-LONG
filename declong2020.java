
import java.util.*;
public class declong2020 {
   public static void main(String[] args) {
       int d1,v1,d2,v2,p,day,sum,f;
       sum=0;f=0;
       Scanner sc = new Scanner(System.in);
       d1=sc.nextInt();
       v1=sc.nextInt();
       d2=sc.nextInt();
       v2=sc.nextInt();
       p=sc.nextInt();
       if(d1<d2)
       {
           day=d1-1;
           while(sum<p)
           {
               sum+=v1;
               if((d1==d2)||(f==1))
               {
                   sum+=v2;
                   f=1;
               }
               d1++;
               day++;
           }
           System.out.println(day);
       }
     else{

        day=d2-1;
            while(sum<p)
            {
                sum+=v2;
                if((d1==d2)||(f==1))
                {
                    sum+=v1;
                    f=1;
                }
                d2++;
                day++;
    }
    System.out.println(day);

    } 
   }
}