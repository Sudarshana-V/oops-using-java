import java.io.*;
public class Jagged_array_foreachloop
{
	public static void main(String args[])
	{
		int a[][]={
			{1,-2,3},
				{-4,-5,6,9},
					{7}
		};
		for(int[] i:a)
		{
			for(int j:i)
			{
				System.out.printf(j+ " ");
			}
			System.out.println();
		}
	}
}