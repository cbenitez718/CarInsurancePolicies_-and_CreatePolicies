// Chapter 4 exercise (pages 191 - 192)

public class CreatePolicies2
{
	public static void main(String[] args) 
	{
		// Variables and constants
		CarInsurancePolicy2 first = new CarInsurancePolicy2(123);
		CarInsurancePolicy2 second = new CarInsurancePolicy2(456, 4);
		CarInsurancePolicy2 third = new CarInsurancePolicy2(789, 12, "Newcastle");

		// Output phase
		first.display();
		second.display();
		third.display();
	}
}