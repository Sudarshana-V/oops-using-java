import java.io.*;
import java.util.*;
public class hollow_pattern
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==n-3 && j==n-2)
					System.out.print("0 ");
				else if(i==n-2 && j==n-3)
					System.out.print("0 ");
				else if(i==n-2 && j==n-1)
					System.out.print("0 ");
				else if(i==n-1 && j==n-2)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}
	}
}