import java.io.*;
import java.util.*;
public class Subtractof_2d
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int column=s.nextInt();
		int arr1[][]=new int[row][column];
		int arr2[][]=new int[row][column];
		int difference[][]=new int[row][column];
		if(row==column)
		{
			System.out.println("Enter element for matrix-1:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					arr1[i][j]=s.nextInt();
				}
			}
			System.out.println("Enter element for matrix-2:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					arr2[i][j]=s.nextInt();
				}
			}
			System.out.println("The difference of two matrices are :");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					difference[i][j]=arr1[i][j]-arr2[i][j];
					System.out.print(difference[i][j]+ " ");
				}
				System.out.println();
			}
		}
	}
}