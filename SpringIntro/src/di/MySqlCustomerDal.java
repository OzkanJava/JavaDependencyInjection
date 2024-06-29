package di;

public class MySqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("mysql Veritabanına eklendi");
		
	}

}
