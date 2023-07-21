import java.io.*;
import java.util.*;
class no_of_even_odd_set_in_String
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String []words=str.split(" ");
		int even_count=0,odd_count=0,set_count=0;
		for(int i=0;i<words.length;i++)
		{
			if((words[i].lengh()-1)%2==0)
				even_count++;
			else
				odd_count++;
			if(words[i]=='of' || words[i]=='is' || words[i]=='the' || words[i]=='on' || words[i]=='in' || words[i]=='at')
				set_count++;
		}
		System.out.println("NO. of word with even num of char : "+even_count);
		System.out.println("NO. of word with even num of char : "+odd_count);
		System.out.println("NO. of word with set occurance : "+set_count);
	}
}