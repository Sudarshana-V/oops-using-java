import java.io.*;
import java.util.*;
public class function_evenodd
{
	public static void main(String args[])
	{
		evenodd s=new evenodd();
		s.evenodd();
	}
}
class evenodd
{
	void evenodd()
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num%2==0)
			System.out.println("even");
	    else
			System.out.print("odd");
	}
}