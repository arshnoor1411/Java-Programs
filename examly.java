import java.util.*;
class examly
{
	public static void main(String x[])
	{
		int num,r,c,i,j,sum=0,k;
		Scanner Sc=new Scanner(System.in);
		String name;
		name=Sc.nextLine();
		r=Sc.nextInt();
		c=Sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println(arr.length);
		for( i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[0].length;j++)
			{
				arr[i][j]=Sc.nextInt();
			}
		}
		int b[][]=new int[r][c];
		for( i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[0].length;j++)
			{
				b[i][j]=Sc.nextInt();
			}
		}
		int u[][]=new int[r][c];
		/*for(i=0;i<arr.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				u[i][j]=arr[i][j]+b[i][j];
			}
		}
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				u[i][j]=arr[i][j]-b[i][j];
			}
		}
		for(i=0;i<arr.length;i++)
		{
			//sum=0;
			for(j=0;j<b.length;j++)
			{
			for(k=0;k<b.length;k++)
			{
				u[i][j]=u[i][j]+arr[i][k]*b[k][j];
			}
		     }
			//System.out.println(sum);
		}
		for(int m[]:u)
		for(int s:m)
		{
			System.out.println(s);
		}
		char str[]=name.toCharArray();
		//System.out.print(str);
		Arrays.sort(str);
		Syste
		m.out.println(str);	*/
	}
}