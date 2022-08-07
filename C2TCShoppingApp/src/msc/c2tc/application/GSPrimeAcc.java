package msc.c2tc.application;

import msc.c2tc.framework.PrimeAcc;


public class GSPrimeAcc extends PrimeAcc
{
	public GSPrimeAcc(int accno, String accname, float charges) 
	{
		super(accno, accname, charges);
	}

	@Override
	public void bookProducts(float charges)
	{
		System.out.println("You have purchased the product of charges"
							+charges);
	}

	@Override
	public String toString() 
	{
		return "GSPrimeAcc[toString()="+super.toString()+",getAccno()="
	    +getAccno()+",getAccname()="+getAccname()+",getCharges()="+"]";
	}

}
