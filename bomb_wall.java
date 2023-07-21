import java.io.*;
import java.util.*;
public class bomb_wall
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String a=s.next();
		char ch[]=new char[a.length()];
		for(int i=0;i<a.length();i++)
			ch[i]=a.charAt(i);
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(ch[i]=='W')
				count++;
		}
		System.out.println(count);
	}
}