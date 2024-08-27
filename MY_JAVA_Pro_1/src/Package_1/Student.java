package Package_1;

public class Student {

	int rollno;
	int age;
	
	public void Display1()
	
	{
		System.out.println("Welcome");
	}
	public void Display2()
	
	{
		System.out.println("Rakesh");
	}
	
	public static void main (String[] args)
	{
		Student s= new Student();
		s.rollno=76565;
		s.rollno=76536;
		s.age=21;
		System.out.println("RollNo:" +s.rollno);
		System.out.println("Age:" +s.age);
		s.Display1();
        s.Display2();
        }
	}
	
	
	
	

