import java.io.*;
import java.util.*;
public class Upper_triangle
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		System.out.println("Enter a 3x3 matrix:");
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
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Upper triangular matrix is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i<=j)
					b[i][j]=a[i][j];
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
	}
}