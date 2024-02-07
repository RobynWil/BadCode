
public class SalaryEmployee extends Payment
{

	@Override
	public double getPayment(double hours, double rate)
	{
		return 40 * rate;
	}

}
