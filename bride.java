import java.io.*;
import java.util.*;
public class bride
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[][]=new int[n][m];
		int num[]=new int[10];
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i][j]==1)
				{
					if(a[i][j]==a[i+1][j+1])
						count++;
					else if(a[i][j]==a[i-1][j-1])
						count++;
					else if(a[i][j]==a[i+1][j-1])
						count++;
					else if(a[i][j]==a[i-1][j+1])
						count++;
					else
						break;
				}
				a[i]=count;
				if(i==j)
					System.out.print(i+ ":" +j+ ":");
			}
		}
		Arrays.sort(a);
		System.out.print(a(n));
	}
}
		