package msc.c2tc.framework;

public class PrimeAcc extends ShopAcc
{
	public PrimeAcc(int accno, String accname, float charges)
	{
		super(accno, accname, charges);	
	}

	public boolean isPrime=true;

	@Override
	public String toString() 
	{
		return "PrimeAcc[isPrime="+isPrime+",getAccno()="+ getAccno() 
		        +",getAccname()="+ getAccname()+",getCharges()="
		        +getCharges()+"]";
	}	
}
