import java.io.*;
import java.util.*;
public class Sum_of_series
{
	public static void man(String args[])
	{
		int i,series=0,n=5;
		for(i=1;i<=n;i++)
		{
			series+=i/i;
		}
	System.out.print(series);
	}
}