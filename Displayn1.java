import java.io.*;
import java.util.*;
public class Displayn1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int num=s.nextInt();
int i;
for(i=num;i>0;i--)
{
System.out.print(i);
}
}
}