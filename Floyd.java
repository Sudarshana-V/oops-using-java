import java.io.*;
public class Floyd
{
	public static void main(String args[])
	{
		int i,j,n=0;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				n=n+1;
				System.out.print(n+ " ");
			}
			System.out.println();
		}
	}
}