import java.io.*;
import java.util.*;
public class diagonalelements_of_matrix
{
	public static void main(String args[])
	{
		int arr[][]=new int[3][3];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a 3x3 matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("The diagonal elements are :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
					System.out.print(arr[i][j]+ " ");
			}
		}
	}
}