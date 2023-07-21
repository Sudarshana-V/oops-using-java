import java.io.*;
import java.util.*;
class max_num_in_a_row_matrix
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int a[][]=new int [n1][n2];
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		int max=0;
		for(int i=0;i<n1;i++)
		{
			max=a[i][0];
			for(int j=1;j<n2;j++)
			{
				if(max<a[i][j])
					max=a[i][j];
			}
			System.out.println("Maximun of " +(i+1)+ "th row is " +max);
		}
	}
}