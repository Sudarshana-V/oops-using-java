import java.io.*;
import java.util.*;
class remove_word
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch[]=new char[str.length()];
		String remove=s.nextLine();
		char rem[]=new char[remove.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
			for(int j=0;j<remove.length();j++)
			{
				rem[j]=remove.charAt(j);
				if(ch[i]==rem[j])
				{
				  System.out.print(" ");
				  i+=1;
				}
                else
				  System.out.print(ch[i]);
                break;			  
			}
		}
		//System.out.print(str.replace('e',' ');
	}
}