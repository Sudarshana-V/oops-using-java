import java.io.*;
import java.util.*;
public class Multiplication_Table_Inverse
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any positive integer :");
		int num=s.nextInt();
		System.out.println("Multiplcation Table of " +num);
		for(int i=10;i>=1;i--)
		{
			System.out.printf("%d x %d = %d",num,i,num*i);
			System.out.println();
		}
	}
}