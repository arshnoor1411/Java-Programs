import java.util.*;
class practice
{
public static void main(String x[])
{
	int k,n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int[] arr=new int[n];
	int[] arr1=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
   // k=sc.nextInt();
	//System.out.println(Arrays.binarySearch(arr,k));
	for(int i=0;i<n;i++)
	{
		arr1[i]=sc.nextInt();
	}
	//System.out.println(Arrays.compare(arr,arr1));
	System.out.println(Arrays.equals(arr,arr1));
//	System.out.println(Arrays.mismatch(arr,arr1));
	System.out.print(Arrays.sort(arr));
}
}