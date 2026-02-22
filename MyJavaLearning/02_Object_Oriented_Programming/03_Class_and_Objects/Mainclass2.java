class Employee
{
	int eid;
	double ctc;
	void work(){
		System.out.println(eid + " is working");
	}
	void meeting(){
		System.out.println(ctc + " is in meeting");
	}
}

public class Mainclass2
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.eid = 101;
		e1.ctc = 8.2;
		e1.work();
		e1.meeting();
		
		System.out.println("-------------------");
		
		Employee e2 = new Employee();
		e2.eid = 102;
		e2.ctc=9.5;
		e2.work();
		e2.meeting();
		
		System.out.println("-------------------");
		
		Employee e3 = new Employee();
		e3.eid = 103;
		e3.ctc=7.5;
		e3.meeting();	
	}
}