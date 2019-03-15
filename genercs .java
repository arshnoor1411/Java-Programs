import java.util.*;
class generic
{
	class Test<T>
	{
		T obj;
		Test()
		{
			this.obj=obj;
		}
		public T getObject()
		{
			return this.obj;
		}
	}
	public static void main(String x[])
	{
		Test<Integer> t1=new Test<Integer>();
		System.out.print(t1.getObject());
	}
}