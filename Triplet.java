import java.io.*;
import java.util.*;
class Triplet
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=s.nextInt();
		int count=0;
		for(int i=0;i<N;i++)
		{
			for(int j=i+1;j<N;j++)
			{
				int sum=arr[i]+arr[j];
				for(int k=0;k<N;k++)
				{
					if(sum==arr[k])
						count++;
				}
			}
		}
		System.out.println(count);
	}
}