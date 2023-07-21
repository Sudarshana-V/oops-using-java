import java.io.*;
import java.util.*;
class seperate_odd_even_in_array
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int count_even=0,count_odd=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
				count_even++;
			else
				count_odd++;
		}
	    int even[]=new int[count_even];
		int odd[]=new int[count_odd];
		int j=0,k=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even[j]=arr[i];
				j+=1;
			}
			else
			{
				odd[k]=arr[i];
				k+=1;
			}
		}
		for(int i=0;i<count_even;i++)
			System.out.print(even[i]+ " ");
		for(int i=0;i<count_odd;i++)
			System.out.print(odd[i]+ " ");
	}
}