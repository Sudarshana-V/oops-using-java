import java.io.*;
import java.util.*;
public class Two
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i,n=4;
		int count=0;
		int H[]=new int[4];
		for(i=0;i<H.length;i++)
			H[i]=s.nextInt();
		for(i=0;i<H.length;i++)
		{
			if(H[i]>H[i+1])
				count++;
			else
				count=1;
		}
		System.out.print(count);
	}
}