import java.io.*;
import java.util.*;
public class Admission
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter phy mark ");
int mphy=s.nextInt();
System.out.println("Enter chem mark ");
int mchem=s.nextInt();
System.out.println("Enter mat mark ");
int mmat=s.nextInt();
int total=mphy+mchem+mmat;
int mp_total=mmat+mphy;
if(mmat>=65 && mphy>=55 && mchem>=50)
{
if(total>=180 || mp_total>=140)
{
System.out.println("The candidate is Eligible for admission");
}
else
{
System.out.println("The candidate is not Eligible for admission");
}
}
}
}