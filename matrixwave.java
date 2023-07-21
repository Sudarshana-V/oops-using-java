import java.io.*;
import java.util.*;
public class matrixwave
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
			if(i%2==0)
			{
				for(int j=0;j<3;j++)
					System.out.print(a[j][i]+ " ");
			}
			else
			{
				for(int j=2;j>=0;j--)
					System.out.print(a[j][i]+ " ");
			}
			System.out.println();
		}
	}
}