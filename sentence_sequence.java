import java.io.*;
import java.util.*;
class sentence_sequence
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String word[]=str.split(" ");
		String newString = "";
		for(String a:word)
		{
			String first=a.substring(0,1);
			String rest=a.substring(1);
			newString+=first.toUpperCase()+rest.toLowerCase()+ " ";
		}
		System.out.println(newString);
	}
}