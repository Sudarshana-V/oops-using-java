import java.io.*;
import java.util.*;
public class Four
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int x=5;
	    char H[]=new char[5];
		int i;
		for(i=0;i<x;i++)
			H[i]=s.next().charAt(0);
		for(i=0;i<x;i++)
		{
			if(H[i]=='H'  || H[i]=='.')
				System.out.println("YES");
			break;
		}
		for(i=0;i<x;i++)
		{
			if(H[i]=='H')
				System.out.print("H");
			else if(H[i]=='.')
				System.out.print("B");
			else
				continue;
		}
	}
}		