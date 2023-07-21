import java.io.*;
import java.util.*;
public class Three
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		char str[]=new char[6];
		int i,count=0;
		for(i=0;i<6;i++)
			str[i]=s.next().charAt(0);
		for(i=0;i<6;i++)
		{
		   if(str[i]=='(' && str[i+1]==')')
			   count=0;
		   else if(str[i]==')' && str[i+1]=='(')
			   count++;
		   else
			   continue;
		}
		System.out.print(count);
	}
}