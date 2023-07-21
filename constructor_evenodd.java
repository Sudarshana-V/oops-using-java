import java.io.*;
import java.util.*;
class evenodd
{
	int n;
	evenodd(int i)
	{
		n=i;
	}
	void display()
	{
		if(n%2==0)
			System.out.print("even");
		else
			System.out.print("odd");
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		evenodd s=new evenodd(n);
		s.display();
	}
}