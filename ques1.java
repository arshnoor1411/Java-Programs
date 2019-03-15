 import java.util.*;
public class ques1
{   
	public static void countFreq(int arr[1000],int n)
    {
    int arr1[1000]={0};
    for(int i=0;i<n;i++)
    {
    arr1[arr[i]]++;    
    }
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]+" occurs "+arr1[i]+" times");
    }
   // System.out.print(n);
    }
 public static void main(java.lang.String a[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();			
		}
		countFreq(arr,n);
	}
}