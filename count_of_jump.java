/*5.Count number of jumps
A person has to  goes down to floor from nth step.he used to jump on the step.The two conditions are followed for jumping.
The first condition is if he is on the odd number of step,he can jump only one step.
The second condition is if he is on even number of step,he can jump to half of the total step.
Now count the total number of jumps he used to reach the floor

Example
INPUT:10
OUTPUT:5
INPUT:13
OUTPUT:7*/

import java.io.*;
import java.util.*;
class count_of_jump
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int step=s.nextInt();
		int jump;
		if(step%2==0)
			jump=step/2;
		else
			jump=(step/2)+1;
		System.out.println(jump);
	}
}