//total words  total vowels  word vowels
import java.io.*;
import java.util.*;
class count_words_vowels_length
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
			ch[i]=str.charAt(i);
		int length=str.length();
		
		//for finding no. of words
		int word_count=1;
		for(int i=0;i<length;i++)
		{
			if(ch[i] == ' ')
				word_count++;
		}
		System.out.println("Total no of words in a sentence is " +word_count);
		
		//for finding total no. of vowels
		int vowel_count=0;
		for(int i=0;i<length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				vowel_count++;
		}
		System.out.println("Total number of vowels in a sentence is " +vowel_count);
		
		//for finding no. of vowels in each word
	     String word[] = str.split(" ");
		for(String a:word)
		{
			int count=0;
			char c[]=new char[a.length()];
			for(int j=0;j<a.length();j++)
				c[j]=a.charAt(j);
			for(int j=0;j<a.length();j++)
			{
				if(c[j]=='a' || c[j]=='e' || c[j]=='i' || c[j]=='o' || c[j]=='u')
					count++;
			}
			System.out.println("Number of vowels in " +a+ " is " +count);
		}
		
	}
}