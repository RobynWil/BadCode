import java.util.ArrayList;

public class Workplace
{
	ArrayList<Employee> employees;

	public Workplace()
	{
		super();
		this.employees = new ArrayList<Employee>();
		
	}
	
	public void addEmployee(Employee e) 
	{
		employees.add(e);
	}
	
	public void removeEmployee(Employee e)
	{
		employees.remove(e);
	}
	
	public void updateHours(Employee e, int hours)
	{
		e.hours = hours;
	}
	
	public void updatePayType(Employee e, String pay)
	{
		e.payType = pay;
	}
	
	public void updatePayRate(Employee e, int rate)
	{
		e.payRate = rate;
	}
	
	public ArrayList<Double> getPay()
	{
		double pay;
		ArrayList<Double> payments = new ArrayList<Double>();
		for(Employee e : employees)
		{
			pay = e.getPay();
			payments.add(pay);
		}
		return payments;
	}
	
	public double getPay(Employee e)
	{
		return e.getPay();
	}
	
}
