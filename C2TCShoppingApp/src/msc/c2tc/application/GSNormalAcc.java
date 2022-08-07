package msc.c2tc.application;

import msc.c2tc.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{

	public GSNormalAcc(int accno, String accname, float charges)
	{
		super(accno, accname, charges);
	}

	@Override
	public void bookProducts(float charges) 
	{
		System.out.println("You have purchased the product with charges "
	                       +charges+" along With delivery charges "
				           +deliveryCharges);
	}
	
}
