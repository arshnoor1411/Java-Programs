import java.util.*;
class string_comp
{
	public static void main(String x[])
	{
	String b,c;
	int count=0,j,i;
	Scanner s=new Scanner(System.in);
	System.out.println("ID:");
	c=s.nextLine();
	System.out.println("Password:");
	b=s.nextLine();
    if(b.length()>=5 && b.length()<=12)
	{
		for(i=0;i<b.length();i++)
		{
			if(b.charAt(i)>46 || b.charAt(i)<58)
			{
				count++;
			    if(count==5)
			   // System.out.println("Invalid password");
				break;
		    }
		    else if(b.charAt(i)>64 || b.charAt(i)<91)
		    {
		    	count++;
		    	if(count==5)
		    		break;
		    }
		    else if(b.charAt(i)>96 || b.charAt(i)<123)
		    {
		    	count++;
		    	if(count==5)
		    		break;
		    }
        }
        if(count<5)
        {
        	System.out.println("Valid Password");
        }
	}
}
}