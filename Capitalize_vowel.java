import java.io.*;
import java.util.*;
class Capitalize_vowel
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=str.length();
		char c[]=new char[n];
		for(int i=0;i<n;i++)
		{
			c[i]=str.charAt(i);
			if(c[i]=='a')
				System.out.print("A");
			else if(c[i]=='e')
					System.out.print("E");
			else if(c[i]=='i')
				System.out.print("I");
			else if(c[i]=='o')
				System.out.print("O");
			else if(c[i]=='u')
				System.out.print("U");
			else
				System.out.print(c[i]);
		}
	}
}