
public class Employee
{
	String name;
	Payment payType;
	double payRate;
	double hours;
	
	public Employee(String name, Payment payType, double payRate, double hours)
	{
		super();
		this.name = name;
		this.payType = payType;
		this.payRate = payRate;
		this.hours = hours;
	}
	
	public double getPay() 
	{
		return payType.getPayment(hours, payRate);
	}
	
	
}
