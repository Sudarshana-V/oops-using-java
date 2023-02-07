import java.io.*;
import java.util.*;
public class Display-1n
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int num=s.nextInt();
int i;
for(i=1;i<=num;i++)
{
System.out.print(i);
}
}
}