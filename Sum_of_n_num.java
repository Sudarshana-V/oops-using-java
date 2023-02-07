import java.io.*;
import java.util.*;
public class Sum_of_n_num
{
public static void main(String args[])
{
int sum=0;
System.out.println("Enter the number : ");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i;
for(i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.printf("The sum is %d",sum);
}
}