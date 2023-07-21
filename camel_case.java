import java.io.*;
import java.util.*;
class camel_case
{
	public static void main(String args[])
	{
		/*Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String word[]=str.split(" ");
		for(String a:word)
		{
			*/
			
		int a=1000000007;
		int b=3;
		double d=b;
		for(int i=2;i<=a;i++)
			d*=b;
		int ans=(int) d;
		System.out.println(ans);
	}
}