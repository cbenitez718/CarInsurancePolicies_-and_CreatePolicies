// Chapter 4 exercise (pages 189 - 192)

public class CarInsurancePolicy2
{
	// Instance variables (data fields for this class)
	private int policyNumber;
	private int numPayments;
	private String residentCity;

	// Various overloaded constructor methods for this class

public CarInsurancePolicy2(int num, int payments, String city)
	{
		policyNumber = num;
		numPayments = payments;
		residentCity = city;
	}

public CarInsurancePolicy2(int num, int payments)
	{
		/*Old
		policyNumber = num;
		numPayments = payments;
		residentCity = "Mayfield";*/
		
		/*Use the master constructor instead of repeating the assignment*/
		this(num, payments, "Mayfield");
	}

public CarInsurancePolicy2(int num)
	{
		/*Old
		policyNumber = num;
		numPayments = 2;
		residentCity = "Mayfield";
		*/
		this(num, 2, "Mayfield");
	}

	// accessor method to show all the policy details
public void display()
	{
		System.out.println("Policy #" + policyNumber + ". " + numPayments + " payments annually. Driver resides in " + residentCity + ".");	
	}
}
