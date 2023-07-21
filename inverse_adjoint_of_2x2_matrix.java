import java.io.*;
import java.util.*;
public class inverse_adjoint_of_2x2_matrix
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		int adj[][]=new int[2][2];
		float modadj;
		float inv[][]=new float [2][2];
		/*adj[0][0]=a[1][1];
		adj[0][1]=-a[0][1];
		adj[1][0]=-a[1][0];
		adj[1][1]=a[0][0];*/
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(i==j)
				{
					if(i==0)
						adj[i][j]=a[i+1][j+1];
					else
						adj[i][j]=a[i-1][j-1];
				}
				else
				{
					adj[i][j]=-a[i][j];
				}
			}
		}
		System.out.println("The adjoint of a matrix is ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(adj[i][j]+ " ");
			}
			System.out.println();
		}
		float  mod1=1;
		float  mod2=1;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(i==j)
					mod1*=a[i][j];
				else
					mod2*=a[i][j];
			}
		}
		modadj=mod1-mod2;
		float m=1/modadj;
		System.out.println("The inverse of a matrix is ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				inv[i][j]=m*adj[i][j];
				System.out.print(inv[i][j]+ " ");
			}
			System.out.println();
		}
	}
}