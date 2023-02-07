import java.io.*;
import java.util.*;
public class Sum_of_two_elements_inarray
{
	public static void main(String args[])
	{
		int array[]={1,2,4,5,6};
		int val=6;
		int sum=0;
		for(int i=0;i<array.length-1;i++)
		{
			sum=array[i]+array[i+1];
			   if(sum==val)
		       {
			      System.out.print("Index : " +i+ "  ");
			      System.out.print("Index : " +(i+1));
		       }
		}
	}
}