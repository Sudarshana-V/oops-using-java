import java.io.*;
import java.util.*;
public class pattern
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		/*int T=s.nextInt();
		int num[]=new int [T];
		for(int i=0;i<T;i++)
		{
			num[i]=s.nextInt();
		}
		for(int i=0;i<T;i++)
		{
			int l=num[i]*2;
			int m=l-2;
			for(int j=0;j<l;j++)
			{
				for(int k=0;k<l;k++)
				{
					if(m>2)
					{
						for(int n=2;n<=m;n++)
							System.out.print("#");
					}
					else
						System.out.print("*");
				}
				System.out.println();
			}
		}*/
		int n=9;
		int m=9*2;
		int l=m-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(m>=2)
				{
					for(int k=j-1;k<n-1;k++)
						System.out.print("#");
					if(j==0 && j==n)
						System.out.print("*");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}