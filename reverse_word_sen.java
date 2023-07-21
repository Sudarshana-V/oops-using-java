//To reverse each word in a sentence
import java.io.*;
import java.util.*;
class reverse_word_sen
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();       //java programming
		String words[]=str.split(" ");
		String revString="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord=revWord+word.charAt(j);
			}
			revString = revString + revWord + " ";
		}
		System.out.println(revString);
		//the above is for reversing each word in a sentence
		//avaj gnimmargorp
		
		for(int i=words.length-1;i>=0;i--)
		{
			String word=words[i];
			String revWord="";
			for(int j=0;j<word.length();j++)
			{
				revWord=revWord+word.charAt(j);
			}
			revString = revString + revWord + " ";
		}
		System.out.println(revString);
		//the above program is for reversing word in sentence
		//programming java
	}
}