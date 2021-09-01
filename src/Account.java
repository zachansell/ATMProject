
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
