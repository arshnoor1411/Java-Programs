import java.util.*;
class student
{
	public static void main(String x[])
	{
		String name,c;
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter student name: ");
		name=s.nextLine();
		System.out.println("Enter the code ");
		c=s.nextLine();
		System.out.println("Student Name:"+name);
			if(c.charAt(0)=='I' ||c.charAt(0)=='M'||c.charAt(0)=='C'||c.charAt(0)=='P' ) 			
			{
			if(c.charAt(0)=='I')
			{
             System.out.println("Major:Information Technology");
			}
			else if(c.charAt(0)=='M')
			{
             System.out.println("Major:Mathematics");
			}
			else if(c.charAt(0)=='C')
			{
             System.out.println("Major:Computer");
			}
			else if(c.charAt(0)=='P')
			{
             System.out.println("Major:Physics");
			}
		    }
			if(c.charAt(2)=='B' ||c.charAt(2)=='O' ||c.charAt(2)=='M') 
            {
		    if(c.charAt(2)=='B')
		    {
		    System.out.println("Campus:Brampton");
		    }
		    else if(c.charAt(2)=='O')
		    {
		    System.out.println("Campus:Oakville");
		    }
		    else if(c.charAt(0)=='M')
		    {
		    System.out.println("Campus:Mandwa");
		    }
		    }
		    else
		    {
		    	System.out.println("Incorrect code");
		    	//break;
		    }
		}
}