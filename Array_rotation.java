import java.io.*;
import java.util.*;
public class Array_rotation
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50};
		int n=arr.length;
		int b=arr[n-1];
		for(int i=n-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=b;
		for(int i:arr)
			System.out.println(i);
	}
}