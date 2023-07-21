import java.io.*;
import java.util.*;
public class Q1
{
	public static void main(String args[])
	{
		String s="00000-00";
		char a=s.charAt(0);
		char b=s.charAt(1);
		char c=s.charAt(2);
		char d=s.charAt(3);
		char e=s.charAt(4);
		char f=s.charAt(5);
		char g=s.charAt(6);
		char h=s.charAt(7);
		char i;
		for(i=a;i<=h;i++)
		{
			if(i=='0')
			{
				System.out.print("NEITHER VALID NOR INVALID");
				break;
			}
			else if(i=='A' || i=='E' || i=='I' || i=='O' || i=='U' || i=='Y')
			{
				System.out.print("VALID");
				break;
			}
			else if(((i+(i+1))%2)==0)
			{
				System.out.print("VALID");
				break;
			}
			else 
			{
				System.out.print("INVALID");
				break;
			}
		}
	}
}