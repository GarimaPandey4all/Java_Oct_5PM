package com.brainmentors.los.operation;

import com.brainmentors.los.customer.Customer;
import com.brainmentors.los.customer.LoanDetails;
import com.brainmentors.los.customer.PersonalInformation;

import static com.brainmentors.los.utils.Utility.serialCounter;

import java.util.ArrayList;

import static com.brainmentors.los.utils.Utility.scanner;

public class LOSProcess {
	
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public void sourcing()
	{
		Customer customer = new Customer();
		customer.setId(serialCounter);
		
		System.out.println("Enter the First Name");
		String firstName = scanner.next();
		System.out.println("Enter the Last Name");
		String lastName = scanner.next();
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println("Enter the Loan type HL, PL, AL");
		String type = scanner.next();
		System.out.println("Enter the Amount");
		double amount = scanner.nextDouble();
		System.out.println("Duration of Loan");
		int duration = scanner.nextInt();
		
		PersonalInformation pd = new PersonalInformation();
		pd.setFirstName(firstName);
		pd.setLastName(lastName);
		pd.setAge(age);
		customer.setPersonal(pd);
		
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setType(type);
		loanDetails.setDuration(duration);
		loanDetails.setAmount(amount);
		customer.setLoanDetails(loanDetails);
		
		customers.add(customer);
		serialCounter++;
	}
	
	public void checkStage(int applicationNumber)
	{
		
	}

}
