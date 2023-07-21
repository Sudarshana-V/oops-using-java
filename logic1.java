import java.io.*;
import java.util.*;
class logic1
{
	public static void main(String args[])
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(j==2)
					System.out.print(a[i][j]+ " ");
				else if(j==1)
				{
					int num=a[i][j+1]-a[i][j];
					System.out.print(num+ " ");
				}
				else
				{
					int num=a[i][j+1]+a[i][j+2];
					System.out.print(num+ " ");
				}
			}
			System.out.println();
		}
	}
}
			