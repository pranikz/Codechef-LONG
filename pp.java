import java.util.*;
import java.math.*;
public class pp 
{
    public static void main(String[] args)
     {
        int t,n,k;
        
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        for (int i = 1; i <=t; i++) {
            n=sc.nextInt();
            k=sc.nextInt(); // inputs
            int []a = new int [n];
            if(n==k) // all nums are positive if n==k
            {
                for (int j = 0; j < n; j++) {
                    System.out.print(i+1+" ");                    
                }
                System.out.println(" ");
            }
            else //if k and n arent equal
            {
                
                if(n%2!=0) // if n is odd 
                {
                    for (int j = 0; j < n; j++) {
                        a[j]= (int) ((i + 1) * Math.pow(-1, i + 2)); // 1-2 3 -4 5.... sequwence is generated                        
                    }
                }
                else{
                    for (int j = 0; j < n; j++) {
                        a[j]= (int) ((i + 1) * Math.pow(-1, i + 1)); // equal positive and negative sequences generated
                    }
                }
                int sum=1,cou,diff=0;
                cou= (int) Math.ceil((double)n/2);  // counting the number of positive numbers
                for (int j = 0; j < n; j++) {
                    sum+=a[j];
                    if(sum>0)
                    {
                        if(cou<k)  // check whether number of positive numbers are less than requires positive numbers
                        {
                            diff=k-cou;
                            for (int j2 = 0; j2 < n; j2++) {
                                if (a[j2]<0){
                                    a[j2]=a[j2]*-1;
                                }
                                cou++;
                                if(cou==k)
                                break;
                            }
                        }
                        else if(cou>k){
                            diff=cou-k;
                            for (int j2 = 0; j2 < n; j2++) {
                                if(a[j2]>0)
                                a[j2]=a[j2]*-1;

                                cou--;
                                if(cou==k)
                                break;
                                
                            }
                        }

                    }                    
                }
            }
          for (int j = 0; j < a.length; j++) {
              System.out.println(a[j]);
          }  
          System.out.println(" ");
        }   
    }
}
