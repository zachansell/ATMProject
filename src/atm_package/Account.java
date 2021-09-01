package atm_package;

public class Account {
	private String id;
	private double balance;
	public Account (String id)
	{
		this.id =id;
		balance = 0;
	}
	public double deposit(double amount)
	{
		balance +=amount;
		return getBalance(); 
	}
	public double withdraw (double amounts)
	{
		if (amounts > balance)
		{
			balance = 0; 
			return balance; 
		}
		balance -= amounts; 
		return getBalance();
	}
	public String getid()
	{
		return id;
	}
	public boolean equals(Account other)
	{
		return id.equals(other.getid());
	}
	public double getBalance ()
	{
		return balance; 
	}
}
