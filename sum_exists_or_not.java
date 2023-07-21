/*2.Determine if the sum of two integers is equal to the given value
Given an array of integers and a value, determine if there are any two integers in the array whose sum is equal to the given value. 
Return true if the sum exists and return false if it does not. 
Consider this array and the target sums:

5
7
1
2
8
4
3

Example 1:
Target Sum
10
7+3=10, 2+8=10

Example 2:
Target Sum
19
No 2 values sum up to 19*/

import java.io.*;
import java.util.*;
class sum_exists_or_not
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int arr[]=new int [] {5,7,1,2,8,4,3};
		int sum=s.nextInt();
		int target=0;
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				target=arr[i]+arr[j];
				if(target==sum)
					break;
			}
		}
		if(target>0 && target==sum)
			System.out.println("True");
		else
			System.out.println("False");
	}
}