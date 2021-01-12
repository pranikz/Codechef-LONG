import java.util.*;

public class test {
    public static void main(String[] args) {
        String a,b;
        int size=0,c=0,c1=0,score=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        b=sc.nextLine();
        char[] ch = a.toCharArray();
        char [] ch1= b.toCharArray();
        for (int i = 0; i <a.length(); i++) 
        {  
            for (int j = 0; j < b.length(); j++) 
            {
                if(ch[i]==ch1[j])
                c1++; 
            } 
            if (c1==1)
                    score+=2;
                else
                    score++;

        }
        System.out.println(score);
    }
}
