import java.io.*;
import java.net.*;
class practice
{
	public static void main(String args[])
	{
		/*try
		{
			int a[]={1,2,3,4,5};
			for(int i=0;i<5;++i)
				System.out.print(a[i]);
			int x=1/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("A");
		}
		catch(ArithmeticException e)
		{
			System.out.print("B");
		}*/
		
		/*try
		{
			int a=args.length;
			int b=10/a;
			System.out.print(a);
		}
		catch(ArithmeticException e)
		{
			System.out.print("1");
		}*/
		
		boolean a=true;
		boolean b=false;
		boolean c=a^b;
		System.out.println(!c);
	}
}