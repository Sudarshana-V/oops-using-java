import java.io.*;
import java.util.*;
public class computer
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int num=0,rem=0;
		for(int i=0;i<2;i++)
		{
			num=k/10;
			rem=k%10;
		}
		if(n==k)
			System.out.print("YES");
		else if(n==num)
			System.out.print("YES");
		else if(n==rem)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}