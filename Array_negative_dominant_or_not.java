import java.io.*;
import java.util.*;
public class Array_negative_dominant_or_not
{
	public static void main(String args[])
	{
		int arr[]=new int[] {-2,-4,-5,1,3};
		int neg=0,pos=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
				neg++;
			else
				pos++;
		}
		if(neg>pos)
			System.out.print("Negative is dominant");
		else
			System.out.print("Positive is dominant");
	}
}