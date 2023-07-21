/*1.Finger Game
Count the given numbers on your fingers and find the correct finger name of given number

        10      11     12     13
  9      8      7      6
  1      2      3      4      5
Thumb  Index  Middle  Ring  Little

Example 1:
INPUT:17
OUTPUT:Thumb
Example 2:
INPUT: 45
OUTPUT:Little*/

import java.io.*;
import java.util.*;
class Finger_game
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num%8==1)
			System.out.println("Thumb");
		else if(num%8==2 || num%8==0)
			System.out.println("Index");
		else if(num%8==3 || num%8==7)
			System.out.println("Middle");
		else if(num%8==4 || num%8==6)
			System.out.println("Ring");
		else if(num%8==5)
			System.out.println("Little");
	}
}