import java.util.ArrayList;

public class CSC360WP1
{
	ArrayList<CSC360E1> e1s;

	public CSC360WP1()
	{
		super();
		this.e1s = new ArrayList<CSC360E1>();
	}
	
	public void CSC360AEs(CSC360E1 a) 
	{
		e1s.add(a);
	}
	
	public void CSC360REs(CSC360E1 bee)
	{
		e1s.remove(bee);
	}
	
	public void CSC360UHs(CSC360E1 con, int hours)
	{
		con.hr = hours;
	}
	
	public void CSC360UPs(CSC360E1 hi, String new1)
	{
		hi.pt = new1;
	}
	
	public void CSC360UPRs(CSC360E1 em, int other)
	{
		em.pr = other;
	}
	
	public ArrayList<Double> CSC360GP()
	{
		double pay;
		ArrayList<Double> payments = new ArrayList<Double>();
		for(CSC360E1 e : e1s)
		{
			pay = e.p();
			payments.add(pay);
		}
		return payments;
	}
	
	public double CSC360RP(CSC360E1 h)
	{
		return h.p();
	}
	
}
