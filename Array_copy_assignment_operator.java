import java.io.*;
import java.util.*;
public class Array_copy
{
	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,6};
		int[] b=a;
		for(int i:b)
			System.out.print(i+ ", ");
	}
}