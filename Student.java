
public class Student {
	
	// Class Variables, Instance Variables, Data Members
	int rollno;
	String name;
	String phone;
	String course;
	double fees;

	//method , member function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student(); // ram - reference variable
		
		System.out.println("Roll no is: "+ram.rollno);
		System.out.println("Name is: "+ram.name);
		System.out.println("Phone is: "+ram.phone);
		System.out.println("Course is: "+ram.course);
		System.out.println("Fees is: "+ram.fees);
		
		ram.rollno = 1001;
		ram.name = "Ram";
		ram.phone = "3264986923";
		ram.course = "MCA";
		ram.fees = 10000.0;
		
		System.out.println("Roll no is: "+ram.rollno);
		System.out.println("Name is: "+ram.name);
		System.out.println("Phone is: "+ram.phone);
		System.out.println("Course is: "+ram.course);
		System.out.println("Fees is: "+ram.fees);

	}

}
