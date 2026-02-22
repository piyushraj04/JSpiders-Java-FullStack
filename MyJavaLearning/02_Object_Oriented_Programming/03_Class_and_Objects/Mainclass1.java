class Student
{
	String name;
	double cgpa;
	void write(){
		System.out.println(name + " is writing");
	}
	void listen(){
		System.out.println(cgpa + " is listening");
	}
}

public class Mainclass1
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.name = "Piyush Raj";
		s1.cgpa = 8.2;
		s1.write();
		s1.listen();
		System.out.println("-------------------");
		Student s2 = new Student();
		s2.name = "Gagan";
		s2.cgpa=9.5;
		s2.listen();
		s2.write();
	}
}