import java.io.*;
import java.util.*;
public class Sum_of_multiplesof_three_and_five
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,num=0;
		for(int i=3;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				num=i;
			}
		sum+=num;
		num=0;
		}
		System.out.println(sum);
	}
}