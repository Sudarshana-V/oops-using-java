import java.io.*;
import java.util.*;
public class celcius_to_fahrenheit
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the celcius : ");
		double cel=s.nextInt();
		double fah=(cel*1.8)+32;
		//fah+=32;
		System.out.print("The fahrenheit = " +fah);
	}
}