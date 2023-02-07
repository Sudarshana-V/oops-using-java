import java.io.*;
import java.util.*;
public class Coordinate
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the co-ordinates");
int x=s.nextInt();
int y=s.nextInt();
if(x>=0 && y>=0)
{
System.out.println("The coordinate point (" +x+ "," +y+ ") lies in First quadrant");
}
else if(x<=0 && y>=0)
{
System.out.println("The coordinate point (" +x+ "," +y+ ") lies in Second quadrant");
}
else if(x<=0 && y<=0)
{
System.out.println("The coordinate point (" +x+ "," +y+ ") lies in Third quadrant");
}
else
{
System.out.println("The coordinate point (" +x+ "," +y+ ") lies in Fourth quadrant");
}
}
}