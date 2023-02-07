import java.io.*;
import java.util.*;
public class transpose_of_matrix
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int column=s.nextInt();
		int a[][]=new int[row][column];
		System.out.println("Enter the elements of the matix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("The transpose of the given matrix is");
		for(int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(a[j][i]+ " ");
			}
			System.out.println();
		}
	}
}