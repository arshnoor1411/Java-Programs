import java.util.*;
class lapindrome
{
	public static void main(String x[])
	{
		String str;
		Scanner Sc=new Scanner(System.in);
		str=Sc.nextLine();
		int num=str.length();
		//System.out.print(num);
		String str1,str2;
		/*char c[]=str.toCharArray();
		char d[]=new char[num];
		char e[]=new char[num];
		for(int i=0;i<num/2;i++)
		{
          d[i]=c[i];
		}
		for(int i=(num/2);i<num;i++)
		{
			e[i]=c[i];
		}
		//System.out.print(c);
		System.out.println(d);
		System.out.println(e);
		for(int i=0;i<num/2;i++)
		{
			for(int j=num/2;j<num;j++)
			{
            if(d[i]==e[j])
		    {
			System.out.println("yes");
		    }
			}
		}*/
		str1=str.substring(0,(num/2));
		str2=str.substring((num/2)+1,num);
		System.out.println(str1);
		System.out.println(str2);
	}
}