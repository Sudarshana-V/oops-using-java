import java.io.*;
import java.util.*;
class GCD_of_two_num
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num;
		if(num1>num2)
			num=num2;
		else
			num=num1;
		while(num>0)
		{
			if(num1%num==0 && num2%num==0)
				break;
			num--;
		}
		System.out.println(num);
	}
}