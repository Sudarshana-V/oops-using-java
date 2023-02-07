import java.io.*;
import java.util.*;
public class Arrayintegers_without_zero_negone
{
	public static void main(String args[])
	{
		int array[]={50,77,12,54,-11};
		Boolean result=true;
		for(int i=0;i<array.length;i++)
		{
		    if(array[i]==0 || array[i]==-1)
			   result=false;
		}
		System.out.print(result);
	}
}