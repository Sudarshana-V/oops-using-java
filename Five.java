import java.io.*;
import java.util.*;
public class Five
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i;
		char a[]=s.next().toCharArray();
		int x,y,z;
		char b[]=new char[6];
		for(i=0;i<5;i++)
		{
			if(i==0 || i==4)
			{
				x=(int)a[5];
				y=(int)a[1];
			}
			else
			{
			    x=(int)a[i];
		        y=(int)a[i+1];
			}
			z=x-y;
			z=z-96;
			b[i]=(char)z;
		}
		for(i=0;i<5;i++) 
		    System.out.print(b[i]);
	}
}