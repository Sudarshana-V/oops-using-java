import java.io.*;
import java.util.*;
public class Q2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int r=s.nextInt();
		int k=s.nextInt();
		int i,count=0;
		if(k==0)
			System.out.print("INFINITE");
		else
		{
		for(i=l;i<=r;i++)
		{
			if(i%k==0)
			{
				count++;
			}
		}
		System.out.print(count);
		}
	}
}