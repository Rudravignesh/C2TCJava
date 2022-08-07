package msc.c2tc.framework;

public class NormalAcc extends ShopAcc
{
	protected final float deliveryCharges=50;
	public NormalAcc(int accno, String accname, float charges)
	{
		super(accno, accname, charges);		
	}
}
