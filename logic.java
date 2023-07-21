import java.io.*;
import java.util.*;
class logic
{
	public static void main(String args[])
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==1 && j==1)
					System.out.print(a[i][j]+ " ");
				else if(i==0 && (j==0 || j==2))
				{
					int num=a[i][j]+a[1][1];
					System.out.print(num+ " ");
				}
				else if(i==2 && (j==0 || j==2))
				{
					int num=a[i][j]+a[1][1];
					System.out.print(num+ " ");
				}
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}