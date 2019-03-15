import java.util.*;
import java.io.*;
class file2
{
	public static void main(String x[])
	{
		try
		{
		File f=new File("‪C:\\Users\\A\\Desktop\\Soorma Anthem-(Mr-Jatt.com).mp3");
		FileInputStream fis=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream("‪‪C:\\Users\\A\\Desktop\\arsh.mp3");
        FileOutputStream fos1=new FileOutputStream("‪C:\\Users\\A\\Desktop\\noor.mp3");
        int k=(int) f.length();
        int i=0;
        while(i!=(k/2))
        {
        	fos.write(fis.read());
        	i++;
        }
        while(i!=k)
        {
        	fos1.write(fis.read());
        	i++;
        }
        System.out.print("Success");
        }
        catch(Exception e){System.out.print("sdfgf");}
	}
}