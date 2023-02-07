import java.io.*;
import java.util.*;
public class Equalelements_of_matrix
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
			for(int i1=0;i1<row;i1++)
			{
				for(int i2=0;i2<row;i2++)
				{
					for(int j1=0;j1<column;j1++)
					{
						for(int j2=0;j2<column;j2++)
						{
							if(arr1[i1][j1]==arr2[i2][j2])
								count++;
						}
					}
				}
			}
			if(count==row*column)
				System.out.println("The matrix has same elements");
			else
				System.out.println("The matrix has different elements");
			
		}
	}
}