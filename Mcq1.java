import java.util.*;
public class Mcq1
{ 
    public static void main(String args[])
    {
        T1.start();
    }
}
 
class T1 extends Thread
{
    public void run()
    {
        System.out.println("Thread executed.");
    }
}