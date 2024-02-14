
public class Employee
{
	String name;
	String payType;
	double payRate;
	double hours;
	
	public Employee(String name, String payType, double payRate, double hours)
	{
		super();
		this.name = name;
		this.payType = payType;
		this.payRate = payRate;
		this.hours = hours;
	}
	
	public double getPay() 
	{
		if (payType == "Contractor")
		{
			return hours * payRate;
		}
		else if (payType == "Hourly")
		{
			if (hours <= 40)
			{
				return hours * payRate;
			}
			else 
			{
				double pay = 40 * payRate;
				double overTime = (hours - 40) * payRate * 1.5;
				return pay + overTime;
				
			}
		}
		else if (payType == "Salary")
		{
			return 40 * payRate;
		}
		else
		{
			return 0;
		}
	}
	
	
}
