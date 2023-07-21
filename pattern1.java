import java.io.*;
import java.util.*;
public class pattern1
{
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==1 && j==1)
					System.out.print(a[i][j]+ " ");
				else if(i==0 && (j==0 || j==2))
				{
					int num=a[i][j]+a[1][1];
					System.out.print(num+ " ");
				}
				else if(i==2 && (j==0 || j==2))
				{
					//int num=a[i][j]+a[1][1];
					System.out.print(a[i][j]+a[1][1]+ " ");
				}
				else if((i==0 || i==2) && j==1)
				{
					if(i==0)
					{
					   if(a[i][j-1]+a[1][1]<10)
						   System.out.print("S ");
					   else
						   System.out.print("D ");
					}
					else
					{
						if(a[i][j+1]+a[1][1]<10)
						   System.out.print("S ");
					   else
						   System.out.print("D ");
					}
				}
				else if(i==1)
				{
					if(j==0)
					{
						if(a[i+1][j]+a[1][1]<10)
						   System.out.print("S ");
					   else
						   System.out.print("D ");
					}
					else
					{
						if(a[i-1][j]+a[1][1]<10)
						   System.out.print("S ");
					   else
						   System.out.print("D ");
					}
				}
				else
					continue;
			}
			System.out.println();
		}
	}
}