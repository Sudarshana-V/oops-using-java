import java.io.*;
import java.util.*;
class friendly_pair
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int add1=0,add2=0;
		System.out.print("The number divided by " +num1+ " is ");
		for(int i=1;i<num1;i++)                                 //Friendly pair is that the number and the addition of 
		{                                                         //that number's divisor are equal then they r called as
			if(num1%i==0)                                           //friendly pair.
			{
				System.out.println(i+ " " );
				add1+=i;
			}
		}
		System.out.print("The number divided by " +num2+ " is ");
		for(int i=1;i<num2;i++)
		{
			if(num2%i==0)
			{
				System.out.println(i+ " " );
				add2+=i;
			}
		}
		if(num1/add1==1 && num2/add2==1)
			System.out.println("Yes,they are friendly pair");
		else if(num1/add1==1)
			System.out.println(num1+ " is friendly");
		else if(num2/add2==1)
			System.out.println(num2+ " is friendly");
		else
			System.out.println("No,they are not friendly pair");
	}
}