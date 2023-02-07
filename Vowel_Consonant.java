import java.io.*;
import java.util.*;
public class Vowel_Consonant
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a alphabet :");
		char a=s.next().charAt(0);
		switch(a)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.println(a+ " is a vowel");
			break;
			default:
			System.out.println(a+ " is a Consonant");
		}
	}
}