import java.io.*;
import java.util.Arrays;
public class Array_equal
{
	public static void main(String args[])
	{
		int[] arr1=new int[] {1,2,3,4};
		int[] arr2=new int[] {4,3,2,1};
		System.out.print("Is arr1 equals to arr2 " +Arrays.equals(arr1,arr2));
	}
}