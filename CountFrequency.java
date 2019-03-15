import java.util.*;
class CountFrequency 
{
static void countFreq(int arr[],int n)
{
	int num;
    int arr1[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	num=arr[i];
    	for(int j=0;j<n;j++)
    	{
    		if(num==arr[j])
             arr1[i]++;
         }
    }
    for(int i=0;i<n;i++)
    {
    	for(int j=0;j<n;j++)
    	{
         if(arr[i]==arr[j])
         {
        System.out.println(arr[j]+" occurs "+arr1[i]+" times");
         }
         break;
}
}
}
public static void main(java.lang.String a[])
	{
		Scanner sc=new Scanner(System.in);
		//CountFrequency ob=new CountFrequency();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();			
		}
		countFreq(arr,n);
	}
}