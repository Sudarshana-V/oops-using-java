import java.io.*;
import java.util.*;
class pattern_box_diagonal
{
    public static void main(String args[])
    {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1 || j==0 || j==n-1)
                System.out.print("* ");
                else if((i==1 && j==1) || (i==1 && j==n-2))
                System.out.print("* ");
                else if((i==n-2 && j==n-2) || (i==n-2 && j==1))
                System.out.print("* ");
			    else if((i==2 && j==2) || (i==2 && j==n-3))
                System.out.print("* ");
			    else if((i==n-3 && j==n-3) || (i==n-3 && j==2))
                System.out.print("* ");  
                else if(i==n/2 && j==n/2)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}