import java.io.*;
import java.util.*;
public class Sum_Odd
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number :");
int num=s.nextInt();
int i=1,sum=0;
while(i<=num)
{
sum=sum+i;
i=i+2;
}
System.out.printf("The sum of odd number is %d",sum);
}
}