import java.util.*;
class encrypt
{
	public static void main(String x[])
	{
		int i,j;
		String p,pass,passw;
		pass="java";
		Scanner s=new Scanner(System.in);
        p=s.nextLine();
		char a[]=p.toCharArray();
		System.out.println("Cipher Text:");
        for(i=0;i<a.length;i++)
        {
        	a[i]+=20;

        System.out.print(a[i]);
        }
        System.out.println();
       if(pass.compareTo(p)==p.compareTo(pass))
        {
        	System.out.println("Accepted");
        }
        else
        {
        	System.out.println("Wrong");
        }
        for(i=0;i<a.length;i++)
        {
        	a[i]-=20;
        }
        System.out.println(a);
        }
	}