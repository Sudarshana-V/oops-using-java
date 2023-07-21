import java.io.*;
import java.util.*;
class fillups
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String remove=s.next();
		String option1=s.next();
		String option2=s.next();
		String word[] = str.split(" ");
		for(String a:word)
		{
			if(a.equals(remove))
				System.out.print("______ ");
			else
				System.out.print(a+ " ");
		}
		System.out.println();
        System.out.println("a) " +option1);
		System.out.println("b) " +option2);
		char option=s.next().charAt(0);
		if(option=='a')
			option=1;
		else if(option=='b')
			option=2;
		else
			System.out.println("Enter correct option");
		switch(option)
		{
			case 1:
			{
				for(String a:word)
		        {
			        if(a.equals(remove))
				        System.out.print(option1+ " ");
			        else
				        System.out.print(a+ " ");
		        }
				break;
			}
			case 2:
			{
				for(String a:word)
		        {
			        if(a.equals(remove))
				        System.out.print(option2+ " ");
			        else
				        System.out.print(a+ " ");
		        }
				break;
			}
			default:
			break;
		}
		System.out.println();
		fillups f=new fillups();
		System.out.println("Your percentage is " +f.review(option)+ "%");
	}
	int review(int option)
	{
		int per;
		if(option==1)
			per=100;
		else if(option==2)
			per=50;
		else
			per=0;
		return per;
	}
}