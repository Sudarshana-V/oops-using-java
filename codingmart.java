import java.io.*;
import java.util.*;
class codingmart
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();    //no. of fences
		int k=s.nextInt(); 	  //no.of colors
		int sgle,dble,trip;
		int total=0;
		if(n==1)
			total=k;
		else if(n==2)
		{
			sgle=n;
			dble=n*(k-1);
			total=sgle+dble;
		}
		else if(n>=3)
		{
			sgle=n;
			dble=n*(n-k);
			trip=n*(n-k);
			total=sgle+dble+trip;
		}
		System.out.println(total);
	}
}