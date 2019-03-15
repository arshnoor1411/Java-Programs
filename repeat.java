import java.util.*;
class repeat
{
	public static void main(String x[])
	{
		int n;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        // Scanner s=new Scanner(System.in);
         arr[i]=Sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			arr[j]=arr[j]+1;
        		}
        	}
        }
        System.out.println("Answer:-");
        for(int i=0;i<n;i++)
        {
        	System.out.println(arr[i]);
        }  
	}
}