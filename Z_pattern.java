import java.io.*;
import java.util.*;
public class Z_pattern
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
				if(i==1 || i==n)
					System.out.print("@");
				else if(j==1 && i==n-1 || j==n && i==2)
					 System.out.print("##");
				else if(n%2!=0 &&  j==n/2+1 && i==n/2+1)
					System.out.print("##");
				else if(n%2==0 && j==n/2 && i==n/2)
					System.out.print("##");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}