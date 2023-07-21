import java.io.*;
import java.util.*;
public class flames
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		char player1[]={'A','J','A','Y'};
		char player2[]={'P','R','I','Y','A'};
		int count=0;
		for(int i=0;i<player1.length;i++)
		{
			for(int j=0;j<player2.length;j++)
			{
				if(player1[i]==player2[j])
				{
					count++;
				}
				//break;
			}
			//break;
		}
		System.out.print(count);
		char a[]={'F','L','A','M','E','S'};
		int num=player1.length+player2.length;
		num=num-(2*count);
		
	}
}