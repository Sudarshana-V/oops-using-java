import java.io.*;
import java.util.*;
public class Q5
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				for(k=i;k<=5;k++)
				{
					System.out.print(" ");
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}
}