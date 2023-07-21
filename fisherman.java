import java.io.*;
import java.util.*;
class fisherman
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		int sum[]=new int [4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				sum[i]+=a[i][j];
			}
		}
		int max=sum[0];
		for(int i=1;i<4;i++)
		{
			if(max<sum[i])
				max=sum[i];
		}
		System.out.println(max);
	}
}