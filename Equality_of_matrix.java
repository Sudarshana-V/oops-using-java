import java.io.*;
import java.util.*;
public class Equality_of_matrix
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int column=s.nextInt();
		int arr1[][]=new int[row][column];
		int arr2[][]=new int[row][column];
		int count=0;
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
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					if(arr1[i][j]==arr2[i][j])
						count++;
				}
			}
			if(count==row*column)
				System.out.println("The matrices are equal");
			else
				System.out.println("The matrices are not equal");
		}
	}
}