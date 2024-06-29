package di;

public class OracleCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Oracle Veritabanına eklendi");
		
	}

}
