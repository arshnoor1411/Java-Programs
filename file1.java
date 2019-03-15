import java.util.*;
import java.io.*;
class file1
{
	public static void main(String x[])
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("C:\\Users\\A\\Desktop\\asd.txt");
			fos.write(65);
			fos.close();
			System.out.println("Hello");
		}
		catch(Exception e){System.out.println(e);}
	}
}