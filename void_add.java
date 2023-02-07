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
}
public class void_add
{
	public static void main(String args[])
	{
		arithmetic s=new arithmetic();
		System.out.println("The sum is " +s.add(10,5));
	}
}