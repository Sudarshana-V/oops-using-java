import java.io.*;
import java.util.*;
public class Eligible_to_vote
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int age=s.nextInt();
String a=(age>=18)?"Eligible to vote":"Not Eligible to vote";
System.out.println(a);
}
}