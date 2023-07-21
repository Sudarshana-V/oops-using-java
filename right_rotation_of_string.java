import java.io.*;
import java.util.*;
class right_rotation_of_string
{
	public static void main(String args[])
	{
		//for integer
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int rr=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i>=rr)
				System.out.print(a[i]+ " ");
		}
		for(int i=0;i<n;i++)
		{
			if(i<rr)
				System.out.print(a[i]+ " ");
		}
		
		//for character
		/*Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char a[]=new char[n];
		for(int i=0;i<n;i++)
			a[i]=s.next().charAt(0);
		int rr=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i>=rr)
				System.out.print(a[i]+ " ");
		}
		for(int i=0;i<n;i++)
		{
			if(i<rr)
				System.out.print(a[i]+ " ");
		}*/
	}
}