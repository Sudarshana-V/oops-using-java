import java.io.*;
import java.util.*;
class Get_str_int_float
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
//String
System.out.println("Enter a String ");
String name=s.nextline();
System.out.println("Your name is " +name);
//Integer
System.out.println("Enter the first number : ");
int x=s.nextInt();
System.out.println("Your num is " +x);
//Float
System.out.println("Enter your mark ");
int mark=s.nextFloat();
System.out.println("Your mark is " +mark);
}
}