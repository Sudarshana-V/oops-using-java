/*8.
Write the code to print the GCD number using recursion*/

import java.io.*;
import java.util.*;
class GCD_using_recursion
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int hcf=HCF(num1,num2);
		System.out.println(hcf);
	}
	
	public static int HCF(int n1,int n2)
	{
		if(n2!=0)
			return HCF(n2,n1%n2);
		else
			return n1;
	}
}