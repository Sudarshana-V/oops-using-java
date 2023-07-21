import java.io.*;
import java.util.*;
public class marvel
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n1+1 && j==n1+1)
					System.out.print(n1+ " ");
				else if(i==1 || j==1|| i==n || j==n)
					System.out.print(n1-n2+ " ");
				else if((i==n1 || i==n1+2 )&& (j==n1 || j==n1+1 || j==n1+2 ))
					System.out.print(n1-1+ " ");
				else if(i==n1+1 && (j==n1 || j==n1+2))
					System.out.print(n1-1+ " ");
				else
					System.out.print(n1-2+ " ");
			}
			System.out.println();
		}
	}
}