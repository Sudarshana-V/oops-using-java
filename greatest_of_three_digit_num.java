import java.io.*;
import java.util.*;
class greatest_of_three_digit_num
{
public static int largestOddNumber(int num) 
{
    String numStr = Integer.toString(num);
    for (int i = numStr.length()-1; i >= 0; i--) 
	{
        int digit = Integer.parseInt(numStr.substring(i, i+1));
        if (digit % 2 == 0) 
		{
            continue;
        }
        if (i > 1 && Integer.parseInt(numStr.substring(i-2, i-1)) % 2 == 1) 
		{
            return Integer.parseInt(numStr.substring(i-2, i+1));
        }
        if (i > 0 && Integer.parseInt(numStr.substring(i-1, i)) % 2 == 1) 
		{
            return Integer.parseInt(numStr.substring(i-1, i+1));
        }
        return digit;
    }
    return -1; // No odd digits found
}

public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int largestOdd = largestOddNumber(num);
    System.out.println(largestOdd);
}
}