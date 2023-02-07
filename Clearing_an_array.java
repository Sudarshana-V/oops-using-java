import java.io.*;
import java.util.*;
public class Clearing_an_array
{
	public static void main(String args[])
	{
		int arr[]={2,22,56,78,14};
		for(int i:arr)
			System.out.println(i);
		System.out.println("After clearing array : ");
		Arrays.fill(arr,0);
		for(int i:arr)
			System.out.println(i);
	}
}