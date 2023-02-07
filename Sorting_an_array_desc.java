import java.io.*;
import java.util.*;
public class Sorting_an_array_desc
{
	public static void main(String args[])
	{
		int array[]=new int[] {90,23,5,109,12,22,67,34};
		Arrays.sort(array);
		System.out.println("Elements of array sorted in ascending order :");
		for(int i=7;i>=0;i--)
			System.out.println(array[i]);
	}
}