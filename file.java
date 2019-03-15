// You are using Java
import java.util.*;
public class file
{
    public static void main(String x[])
    {
        int a,n;
        String s,s1;
        Map<String,Integer> m=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            s=sc.next();
            a=sc.nextInt();
            m.put(s,a);
        }
        for(int i=0;i<n;i++)
        {
            s1=sc.next();
            if(m.containsKey(s1))
            {
                System.out.println(s1);
            }
            else
            {
                System.out.println("Not Found");
            }
        }
//        System.out.print(s1);
    }
}