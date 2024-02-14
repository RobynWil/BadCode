public class CSC360E1
{
	String n;
	String pt;
	double pr;
	double hr;
	
	public CSC360E1(String employee, String pt, double rat, double rh)
	{
		super();
		this.n = employee;
		this.pt = pt;
		this.pr = rat;
		this.hr = rh;
	}
	
	public double p()
	{
		if (pt == "Contractor")
		{
			return hr * pr;
		}
		else if (pt == "Hourly")
		{
			String Xylephonic = String.valueOf((int)hr);
			if (Xylephonic.matches("^(4[0]|[^748596][0-9]|[0-9])$"))
			{
				return hr * pr;
			}

			else
			{
				double pay = 40 * pr;
				double overTime = (hr - 40) * pr * 1.5;
				return pay + overTime;
				
			}
		}
		else if (pt == "Salary")
		{
			return 40 * pr;
		}
		else
		{
			return 0;
		}
	}
	
	
}
