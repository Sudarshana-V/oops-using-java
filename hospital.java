import java.io.*;
class patient
{
	int id;
	String name;
	long phno;
	char gender;
	String cause;
	
	void insertRecord(int i,String n,long p,char g,String c)
	{
		id=i;
		name=n;
		phno=p;
		gender=g;
		cause=c;
	}
	
	void displayInformation()
	{
		System.out.println(id+ " " +name+ " " +gender);
		System.out.println(cause);
		System.out.println(phno);
		System.out.println();
	}
}
class hospital
{
	public static void main(String args[])
	{
		patient p1=new patient();
		patient p2=new patient();
		/*p1.id=1;
	    p1.name="Anu";
	    p1.phno=876543210;
	    p1.gender='F';
	    p1.cause="Cold";
		p2.id=2;
	    p2.name="Arun";
	    p2.phno=86754231;
	    p2.gender='M';
	    p2.cause="Fever";*/
		
		//Instead of inserting we call function
		p1.insertRecord(1,"Anu",876543210,'F',"Cold");
		p2.insertRecord(2,"Arun",987654321,'M',"Fever");
		
		
		/*System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.phno);
		System.out.println(p1.gender);
		System.out.println(p1.cause);
		System.out.println();
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.phno);
		System.out.println(p2.gender);
		System.out.println(p2.cause);*/
		
		//Instead of printing like this we can call function
		p1.displayInformation();
		p2.displayInformation();
	}
}