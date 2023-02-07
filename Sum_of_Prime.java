import java.io.*;
import java.util.*;
public class Sum_of_Prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number :");
int num=s.nextInt();
int i,j,count,sum=0;
for(i=1;i<=num;i++)
{
	count=0;
	for(j=2;j<=i/2;j++)
	{
		if(i%j==0)
		{
			count++;
		    break;
		}
	}
	if(count==0)
		  sum=sum+i;
}
 System.out.println("The sum of Prime numbers is " +sum);
}
}