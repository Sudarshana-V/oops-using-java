import java.io.*;
public class Armstrong
{
	public static void main(String args[])
	{
		int num,i,a,cube=0;
		for(i=2;i<=500;i++)
		{
			num=i;
			while(num!=0)
			{
			   a=num%10;
			   cube+=(a*a*a);
			   num=num/10;
			}
			if(cube==i)
				System.out.printf(" %d",i);
			cube=0;
		}
	}
}