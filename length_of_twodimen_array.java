import java.io.*;
import java.util.Arrays;
public class length_of_twodimen_array
{
	public static void main(String args[])
	{
		int a[][]={{1,2,3},{4,5,6,9},{7}};
		System.out.println("Length of row 1 : " + a[0].length);
		System.out.println("Length of row 2 : " + a[1].length);
		System.out.println("Length of row 3 : " + a[2].length);
		System.out.println("Length of row 1 : " + a.length);
		System.out.println(a);
		System.out.println(Arrays.deepToString(a));
	}
}