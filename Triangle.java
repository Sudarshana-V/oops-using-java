import java.io.*;
import java.util.*;
public class Triangle
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the angles:");
int angle1=s.nextInt();
int angle2=s.nextInt();
int angle3=s.nextInt();
int sum_of_angle=angle1+angle2+angle3;
if(sum_of_angle==180)
System.out.println("Triangle is formed");
else
System.out.println("Triangle is not formed");
}
}