import java.io.*;
import java.util.*;
public class Heart_printing
{
	public static void main(String args[])
	{
		int n=10;
		for(int i=1;i<=n;i=i+2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			System.out.print(" ");
		}
		/*for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	*/
	}
}