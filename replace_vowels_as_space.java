import java.io.*;
import java.util.*;
class replace_vowels_as_space
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
			ch[i]=str.charAt(i);
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				System.out.print(" ");
			else
				System.out.print(ch[i]);
		}
	}
}