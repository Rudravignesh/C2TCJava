package msc.c2tc;

import msc.c2tc.application.GSNormalAcc;
import msc.c2tc.application.GSPrimeAcc;
import msc.c2tc.application.GSShopFactory;
import msc.c2tc.framework.NormalAcc;
import msc.c2tc.framework.PrimeAcc;
import msc.c2tc.framework.ShopFactory;

public class Client {

	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		ShopFactory sf= new GSShopFactory();
		 
		PrimeAcc pa= new GSPrimeAcc(123,"Rudra",1000);
		pa.bookProducts(500);
		NormalAcc na=new GSNormalAcc(456,"Rishab",0);
		na.bookProducts(500);
	}
}
