import java.io.*;
import java.util.*;
public class Adjoint_of_matrix
{
	public static void main(String args[])
	{
		int a[][]={{2,3},{1,4}};
		int b[][]=new int[2][2];
		int i,j;
		b[0][0]=a[1][1];
		b[0][1]=-a[0][1];
		b[1][0]=-a[1][0];
		b[1][1]=a[0][0];
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
	}
}