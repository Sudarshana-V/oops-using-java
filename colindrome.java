import java.io.*;
import java.util.*;
class colindrome
{
	public static void main(String args[])
	{
		String str="mallamaappaa";
		String s1=str.substring(0,3);
		System.out.println(s1);
		String revs1=s1.reverse();
		String s2=str.substring(3,6);
		System.out.println(revs1+ " " +s2);
	}
}