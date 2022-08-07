package msc.c2tc.application;

import msc.c2tc.framework.NormalAcc;
import msc.c2tc.framework.PrimeAcc;
import msc.c2tc.framework.ShopFactory;

public class GSShopFactory implements ShopFactory
{

	@Override
	public PrimeAcc getNewPrimeAccount(int accno, String accname, float charges)
	{
		PrimeAcc pa=new PrimeAcc(accno,accname,charges);
		return pa;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accno, String accname, float charges)
	{
		NormalAcc na =new NormalAcc(accno,accname,charges);
		return na;
	}


}
