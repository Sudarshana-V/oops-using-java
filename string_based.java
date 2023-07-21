import java.io.*;
import java.util.*;
class  string_based
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int count=0;
        String sa[]=new String[10];

        for(int i=0;i<=num;i++)
		{
			sa[i]=s.nextLine();
		}

       /* for (int i=0; i<=num; i++)   
        {  
           System.out.println(sa[i]);  
        }  */

        System.out.println(); 
        for (int i=0; i<=num; i++)   
        { 
           for (int j=i+1; j<=num; j++)   
           { 
               if(sa[i].equals(sa[j]))
			   {
				   System.out.println(sa[i]);
			   }
		   }
		}
	}
}