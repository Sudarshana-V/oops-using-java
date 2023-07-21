import java.io.*;
import java.util.*;
class box
{
	Scanner s=new Scanner(System.in);
	double width=s.nextDouble();
	double height=s.nextDouble();
	double depth=s.nextDouble();
}
public class vol_of_box
{
	public static void main(String args[])
	{
		box b=new box();
		double vol;
		vol=b.width*b.height*b.depth;
		System.out.print("Volume = "+vol);
	}
}