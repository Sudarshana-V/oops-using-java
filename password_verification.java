/*password verification with 
1) no symbols
2) one uppercase
3) 8-10 characters
4) one number*/

import java.io.*;
import java.util.*;
class password_verification
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch[]=new char[str.length()];
		if(str.length()<8)
			System.out.println("Your password is too short");
		else if(str.length()>10)
			System.out.println("Your password is too long");
		int small=0,caps=0,num=0,special=0;
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
			if(ch[i]>='a' && ch[i]<='z')
				small++;
			else if(ch[i]>='A' && ch[i]<='Z')
				caps++;
			else if(ch[i]>='0' && ch[i]<='9')
				num++;
			else 
			{
				System.out.println("Password should not have special characters");
				special++;
			}
		}
		if(num==0)
			System.out.println("Password requires atleast one numeric value");
		if(caps==0)
			System.out.println("Password requires atleast one capital value");
		if(special!=0)
			System.out.println("Your password is invalid");
		else
			System.out.println("Your password is valid");
	}
}