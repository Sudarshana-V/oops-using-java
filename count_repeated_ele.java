import java.io.*;
import java.util.*;
public class count_repeated_ele
{
	public static void main(String args[])
	{
		int array[]=new int[10];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++)
			array[i]=s.nextInt();
		int r1=0,r2=0;
		int count=0;
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(array[i]==array[j])
				{
					if(r1==0)
					{
						r1=array[i];
						count++;
					}
					else if(r2==0 && r1!=array[i])
					{
						r2=array[i];
						count++;
					}
					else
						continue;
				}
			}			
		}
		System.out.println("Total Repeated elements: " +count);
		System.out.print("Repeated elements are : " +r1+ " " +r2);	
	}
}