import java.io.*;
import java.util.*;
class game
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int trap=0;
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		if(a[n-1]>a[n-2])
			trap+=a[n-1]+a[n-2];
		if(trap==0)
			trap+=a[n-1];
		System.out.println(trap);
	}
}