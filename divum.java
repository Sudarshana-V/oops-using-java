import java.io.*;
import java.util.*;
class divum
{
	/*public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String rearrange=rearrangeString(str);
		System.out.println(rearrange);
	}
	public static String rearrangeString(String str)
	{
		char ch[]=string.toCharArray();
		for(int i=0;i<ch.length-1;i+=2)
		{
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		String rearrange=new String (ch);
		return rearrange;
	}*/
	/*public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int count=0;
		while(num1!=0 && num2!=0)
		{
			if(num1>num2)
				num1=num1-num2;
			else if(num2>num1)
				num2=num2-num1;
			else if(num1==num2)
			{
				count++;
				break;
			}
			count++;
		}
		System.out.println(count);
	}*/
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
			ch[i]=str.charAt(0);
		boolean result=false;
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]==" ")
			{
				if(ch[i-1].equalsto(ch[i+1]))
					result=true;
			}
			if(i==str.length-1)
			{
				if(ch[0].equalsto(ch[i]))
					result=true;
			}
		}
		System.out.println(result);
	}
}
