
public class HourlyEmployee extends Payment
{

	@Override
	public double getPayment(double hours, double rate)
	{
		if (hours <= 40)
		{
			return hours * rate;
		}
		else 
		{
			double pay = 40 * rate;
			double overTime = (hours - 40) * rate * 1.5;
			return pay + overTime;
			
		}
		
	}

}
