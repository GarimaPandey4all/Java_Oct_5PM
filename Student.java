
public class Student {
	
	// Class Variables, Instance Variables, Data Members
	// Data Hiding or Abstraction
	private int rollno;
	private String name;
	private String phone;
	private String course;
	private double fees;
	private String collegeName;
	
	//default constructor
	Student()
	{
		//constructor chaining
		//this(1001, "Ram", "3928958989", "MCA", 10000.0); // call to the parameterized cons
		collegeName = "SRCC";
	}
	
	//parameterized constructor
	Student(int rollno, String name, String phone, String course, double fees)
	{
		//constructor chaining
		this(); // call to the default constructor
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;
	}
	
//	r, n, p, c, f - local variables
	//public void takeInput(int r, String n, String p, String c, double f)
	/*
	public void takeInput(int rollno, String name, String phone, String course, double fees)
	{
		//instance variable = local variable
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;
	}
	*/
	
	public void print()
	{
		System.out.println("Roll no is: "+this.rollno); // here this keyword is optional to mention
		System.out.println("Name is: "+name);
		System.out.println("Phone is: "+phone);
		System.out.println("Course is: "+course);
		System.out.println("Fees is: "+fees);
		System.out.println("College Name is: "+collegeName);
	}

	//method , member function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student ram = new Student();
		Student ram = new Student(1001, "Ram", "3928958989", "MCA", 10000.0); // ram - reference variable
		//ram.takeInput(1001, "Ram", "3928958989", "MCA", 10000.0);
		ram.print();
		
		/*
		System.out.println("Roll no is: "+ram.rollno);
		System.out.println("Name is: "+ram.name);
		System.out.println("Phone is: "+ram.phone);
		System.out.println("Course is: "+ram.course);
		System.out.println("Fees is: "+ram.fees);
		*/
		/*
		ram.rollno = -1001;
		ram.name = "Ram";
		ram.phone = "3264986923";
		ram.course = "MCA";
		ram.fees = 10000.0;
		*/
		
		/*
		System.out.println("Roll no is: "+ram.rollno);
		System.out.println("Name is: "+ram.name);
		System.out.println("Phone is: "+ram.phone);
		System.out.println("Course is: "+ram.course);
		System.out.println("Fees is: "+ram.fees);
		*/

	}

}
