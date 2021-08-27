
public class Account {
	private String id;
	private double balance;
	public Account (String id)
	{
		this.id =id;
		balance = 0;
	}
	public void deposit(double amount)
	{
		balance +=amount;
	}
}
