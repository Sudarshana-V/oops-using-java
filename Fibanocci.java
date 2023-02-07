import java.io.*;
import java.util.*;
public class Fibanocci
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the term :");
		int term=s.nextInt();
		int n1=0,n2=1,n3;
		int i=1;
		while(i<=term)
		{
			System.out.printf("%d ",n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
			i++;
		}
	}
}