import java.io.*;
import java.util.*;
public class twodimen_uservalue
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int column=s.nextInt();
		int a[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Elements in array are : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
}