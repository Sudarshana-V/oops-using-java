import java.io.*;
import java.util.*;
class quadruplets
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++)
			nums[i]=s.nextInt();
		int result=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(nums[i]>nums[j])
					result=nums[j];
			}
		}
		System.out.println(result);
	}
}