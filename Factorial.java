import java.io.*;
import java.util.*;
public class Factorial
{
public static void main(String args[])
{

System.out.println("Enter a number :");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=1;
int fact=1;
while(i<=n)
{
fact=fact*i;
i++;
}
System.out.printf("The Factorial is %d",fact);
}
}