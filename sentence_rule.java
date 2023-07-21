import java.io.*;
import java.util.*;
class sentence_rule
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println((str.substring(0,1)).toUpperCase()+(str.substring(1)).toLowerCase()+ " ");
	}
}