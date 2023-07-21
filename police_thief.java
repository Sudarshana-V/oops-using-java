import java.io.*;
import java.util.*;
class police_thief
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		char arr[]=new char[n];
		for(int i=0;i<n;i++)
			arr[i]=s.next().charAt(0);
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]=='P')
			{
				for(int j=i;j<i+k;j++)
				{
					if(arr[j]=='T')
						count++;
				}
			}
			else 
			{
				for(int j=i;j<i-k;j++)
				{
					if(arr[j]=='T')
						count++;
				}					
			}
		}
		System.out.println(count);
	}
}