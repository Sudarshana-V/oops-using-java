import java.io.*;
import java.util.*;
class complex
{
	void add(int r1,int i1,int r2,int i2)
	{
		int a=r1+r2;
		int b=i1+i2;
		System.out.println(a+ "+" +b+ "i");
	}
	void sub(int r1,int i1,int r2,int i2)
	{
		int a=r1-r2;
		int b=i1-i2;
		System.out.println(a+ "+" +b+ "i");
	}
	void mul(int r1,int i1,int r2,int i2)
	{
		int a=(r1*r2)-(i1*i2);
		int b=(r1*i2)+(r2*i1);
		System.out.println(a+ "+" +b+ "i");
	}
}
class complex_operation
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int r1=s.nextInt();
		int i1=s.nextInt();
		int r2=s.nextInt();
		int i2=s.nextInt();
		complex c=new complex();
		c.add(r1,i1,r2,i2);
		c.sub(r1,i1,r2,i2);
		c.mul(r1,i1,r2,i2);
	}
}