import java.io.*;
class Animal
{
	void eat(){System.out.println("eating...");}
}
class Dog extends Animal
{
	void bark(){System.out.println("barking...");}
}
class single_inheritance
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.eat();
		d.bark();
	}
}