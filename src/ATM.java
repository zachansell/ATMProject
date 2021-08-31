import java.util.*;
public class ATM {
	private ArrayList<Account> accounts;
	public void deposit (String account, double amount)
	{
		
		if(!accounts.contains(new Account(account)))
		{
			Account newAcc = new Account(account);
			accounts.add(newAcc);
			newAcc.deposit(amount);
		}
		else
		{
			accounts.get(accounts.indexOf(new Account(account))).deposit(amount);
		}
	}
}
