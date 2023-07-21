/*10.
Write a program to find the double of the given number without using arithmetic operator*/

import java.io.*;
import java.util.*;
class double_no_without_using_arithmeticoperation
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int doublenum=num<<1;
		//for(int i=0;i<num;i++)
			//doublenum++;
		System.out.println(doublenum);
	}
}

/* num<<1
num=10
binary format : 32 16 8 4 2 1
binary of 10  :       1 0 1 0  8+2=10   num
left shift by 1     1 0 1 0    16+4=20  num<<1
left shift by 2  1  0 1 0      32+8=40  num<<2
*/