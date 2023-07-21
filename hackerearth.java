import java.io.*;
import java.util.*;
class hackerearth
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int length=s.nextInt();
		String str=s.nextLine();
		char a[]=Arrays.deeptoString(str);
		char b[]={'h','a','c','k','e','r','e','a','r','t','h'};
		char c[]=new char[length];
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(a[i]==a[j])
			      c[i]=a[i];
			}
		}
		if(Arrays.equals(a,c))
			System.out.println(1);
	}
}			