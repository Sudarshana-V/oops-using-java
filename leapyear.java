import java.io.*;
import java.util.*;
public class leapyear
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int year=s.nextInt();
if(year%4==0)
System.out.println(year+ " is a leap year");
else
System.out.println(year+ " is not a leap year");
}
}