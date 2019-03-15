import java.util.*;
class strings
{
	public static void main(String x[])
	{
		int n,a,i;
		TreeSet<Integer> h=new TreeSet<>();
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{n
			a=sc.nextInt();
            h.add(a);
		}
		/*for(i=0;i<n;i++)
		{
			System.out.print(h.get(i)+" ");
		}*/
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}
}class A {
	private void printName()
	{
		System.out.println("Value-A");
	}
}
class B extends A
{
	public void printName()
	{
		System.out.println("Value-B");
	}
}
public class mcqTest {
	public static void main(String args[])
	{
		B b= new B();
		b.printName();
	}
}