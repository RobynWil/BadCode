
public class Contractor extends Payment
{

	@Override
	public double getPayment(double hours, double rate)
	{
		return hours * rate;
	}

}
