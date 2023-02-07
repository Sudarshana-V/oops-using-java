import java.io.*;
import java.util.*;
public class Oddeven
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
if(num%2==0)
{
System.out.println(num+ "is an Even integer");
}
else
{
System.out.println(num+ " is an Odd integer");
}
}
}