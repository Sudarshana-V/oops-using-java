import java.io.*;
import java.util.*;
public class Reverse
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num of digits :");
		int n=s.nextInt();
		System.out.println("Enter the number :");
		int number=s.nextInt();
		int a,rev=0,i;
		int num=number;
		for(i=1;i<=n;i++)
		{
			a=num%10;
			rev=(rev*10)+a;
			num=num/10;
		}
		System.out.printf("Reverse of %d is %d",number,rev);
	}
}