import java.io.*;
import java.util.*;
public class pattern2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int[2][5];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			  a[i][j]=s.nextInt();
		}
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<5;j++)
			{
			   if(j==0 || j==3)
			    System.out.print((a[i][j]*a[i+1][j])+a[i][j]+ " ");
			   else if(j==1 || j==4)
			    System.out.print((a[i][j]*a[i+1][j])-a[i][j]+ " ");
		       else
			    System.out.print((a[i][j]*a[i+1][j])+ " ");
			}
		}
		System.out.println();
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<5;j++)
			{
			   if((j==0 || j==3) && (((a[i][j]*a[i+1][j])+a[i][j])<10))
				   System.out.print("S ");
			   else if((j==1 || j==4) && (((a[i][j]*a[i+1][j])-a[i][j])<10))
				   System.out.print("S ");
			   else if(j==2 && ((a[i][j]*a[i+1][j])<10))
				   System.out.print("S ");
			   else 
				   System.out.print("D ");
			}
		}
		System.out.println();
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print((a[i+1][j]%a[i][j])+ " ");
			}
		}
		System.out.println();
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((a[i+1][j]%a[i][j])==0)
					System.out.print("N ");
				else if((a[i+1][j]%a[i][j])==1)
					System.out.print("O ");
				else
					System.out.print("E ");
			}
		}
	}
}