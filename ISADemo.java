package com.tcs.java.oops;

class Person { // Parent Class
	private String name;
	protected int salary;
	
	public Person()
	{
		name = "Ram";
	}
	
	public void printName()
	{
		System.out.println("Name of the Person is: "+name);
	}
	
	public void contNumber()
	{
		System.out.println("Person Contact Number");
	}
}

//Child Class
class Stdent extends Person {
	
	private int id;
	
	public Stdent()
	{
		super(); // Parent Default Cons Call (Implicit Super Call)
		id = 101;
		salary = 10000;
	}
	
	public void printId()
	{
		System.out.println("Id of the Student is: "+id);
		System.out.println("Salary of the Student is: "+salary);
	}
	
	@Override
	public void contNumber()
	{
		System.out.println("Student Contact Number");
	}
}



public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Stdent student = new Stdent();
		student.printId();
		student.printName();
		student.contNumber();
		
		Person ram = new Person();
		ram.contNumber();
	}

}
