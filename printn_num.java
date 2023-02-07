import java.io.*;
import java.util.*;
public class printn_num
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
				System.out.print(j);
			}
			System.out.println();
		}
	}
}