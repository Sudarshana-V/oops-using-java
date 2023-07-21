import java.io.*;
import java.util.*;
public class hollow_square
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
				if(i==1 || j==1 || i==n || j==n)
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}