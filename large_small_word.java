import java.io.*;
import java.util.*;
public class large_small_word
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String sentence=s.next();
		String w[]=new String[sentence.length()];
		for(int i=0;i<sentence.length();i++)
			w[i]=sentence.split();
		for(int i=0;i<sentence.length();i++)
			System.out.println(w[i]);
		
	}
	}