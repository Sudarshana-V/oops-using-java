import java.io.*;
import java.util.*;
class arrange_array_alternate
{
	public static void swap_of_string(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str="abcde";
		String goal="cdeab";
		boolean result=swap(str,goal);
		System.out.println(result);
	}
	public static boolean swap(String str,String goal)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str==goal)
			{
				return true;
			}
			char first=str.charAt(0);
			str=str.substring(0)+first;
		}
		return false;
	}
}
