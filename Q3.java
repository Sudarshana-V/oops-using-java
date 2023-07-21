import java.io.*;
import java.util.*;
public class Q3
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i,rev=0,a,x,y;
		if(num<=0)
			System.out.print("NOT POSSIBLE");
		else
		{
		for(i=1;i<=2;i++)
		{
			a=num%10;
			rev=(rev*10)+a;
			num=num/10;
		}
			x=rev/10;
			if(x%2==0)
				System.out.println("EVEN");
			else
				System.out.println("ODD");
			y=rev%10;
			if(y%2==0)
				System.out.println("EVEN");
			else
				System.out.println("ODD");
		}
	}
}