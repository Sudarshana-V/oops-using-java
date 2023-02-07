import java.io.*;
import java.util.*;
public class Sum_of_FirstandLast
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a digit :");
		int num=s.nextInt();
		int a,b,sum=0;
		a=num/1000;
		b=num%10;
		sum+=a+b;
		System.out.printf("The sum of %d and %d is %d",a,b,sum);
	}
}