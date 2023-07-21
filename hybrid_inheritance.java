import java.io.*;
//parent class
class Grandfather
{
	public void A()
	{
		System.out.println("I am grandfather");
	}
}
//inherits Grandfather properties
class Father extends Grandfather
{
	public void B()
	{
		System.out.println("I am father");
	}
}
//inherits father properties
class Son extends Father
{
	public void B1()
	{
		System.out.println("I am son");
	}
}
class Daughter extends Father
{
	public void B2()
	{
		System.out.println("I am daughter");
	}
}
class hybrid_inheritance
{
	public static void main(String args[])
	{
		Son s=new Son();
		s.A();
		s.B();
		s.B1();
		//s.B2(); - can't find symbol - error
	}
}