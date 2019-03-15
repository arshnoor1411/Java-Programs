import java.util.*;
public class ques8
{
	public static void avgArray(int arr[1000],int n,int avg)
	{
	for(int i=0;i<n;i++)
    {
    int count=0;
    int[] arr1=new int[n];
    int a;
    a=(arr[i]+avg)/2;
    for(int j=0;j<n;j++)
    {
        if(a==arr[i])
        {
            count=count+1;
        }
        arr1[j]=count;
    }
    for(int k=0;k<n;k++)
    {
        System.out.println(arr1[i]);
    }
    }
  	}
   public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n,avg;
		for(int i=0;i<t;i++)
		{
			n=sc.nextInt();
			avg=sc.nextInt();
			int arr[]=new int[n];
			for(int j=0;j<n;j++)
				arr[j]=sc.nextInt();
			avgArray(arr,n,avg);
		}
	}
}
