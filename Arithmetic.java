import java.io.*;
class arithmetic
{
	int num1;
	int num2;
	void insert(int a,int b)
	{
		num1=a;
		num2=b;
	}
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	int div(int a,int b)
	{
		int c=a/b;
		return c;
	}
	int mod(int a,int b)
	{
		int c=a%b;
		return c;
	}
}
public class void_arith
{
	public static void main(String args[])
	{
		arithmetic s=new arithmetic();
		System.out.println("The sum is " +s.add(10,5));
		System.out.println("The subtraction is " +s.sub(10,5));
		System.out.println("The multiplication is " +s.mul(10,5));
		System.out.println("The division is " +s.div(10,5));
		System.out.println("The modulus is " +s.mod(10,5));
	}
}