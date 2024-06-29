package di;

public class OracleCustomerDal implements ICustomerDal{
	
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println(connectionString);
		System.out.println("Oracle Veritabanına eklendi");
		
	}

}
