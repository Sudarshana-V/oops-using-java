import java.io.*;
import java.util.*;
public class prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter a number :");
int num=s.nextInt();
int limit=num/2;
int i,count=0;
for(i=2;i<=limit;i++)
{
if(num%i==0)
count++;
}
if(count>0)
System.out.print("Not prime");
else
System.out.print("Prime");
}
}