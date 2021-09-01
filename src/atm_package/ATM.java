package atm_package;
import java.util.*;
public class ATM {
	private ArrayList<Account> accounts = new ArrayList <Account> (); 
	public double deposit (String account, double amount)
	{
		
		
		
		if(accounts.isEmpty() || zachAnsellCodeFixerHelperPleaseHelpIHaveSpentTooLongTryingToFixThis (account) == -1) 
		{
			Account newAcc = new Account(account);
			accounts.add(newAcc);
			newAcc.deposit(amount);
			return newAcc.getBalance(); 
		}
		else
		{
			return(accounts.get(zachAnsellCodeFixerHelperPleaseHelpIHaveSpentTooLongTryingToFixThis( account)).deposit(amount));
		}
		
		
	}
	
	
	public double withdraw (String account, double amount)
	{
		if(accounts.isEmpty() || zachAnsellCodeFixerHelperPleaseHelpIHaveSpentTooLongTryingToFixThis (account) == -1) 
		{
			throw new NullPointerException(); 
		}
		else
		{
			return(accounts.get(zachAnsellCodeFixerHelperPleaseHelpIHaveSpentTooLongTryingToFixThis( account)).withdraw(amount));
		}
	}
	
	
	private int zachAnsellCodeFixerHelperPleaseHelpIHaveSpentTooLongTryingToFixThis (String account)
	{
		int counter = 0; 
		for (int i =0; i < accounts.size(); i++)
		{
			if (accounts.get(i).getid().equals(account)) 
			{
			 return counter;
			}
			counter++; 
		}
		return -1; 
	}
	public double checkBalance (String account)
	{
		if(accounts.isEmpty() || zachAnsellCodeFixerHelperPleaseHelpIHaveSpentTooLongTryingToFixThis (account) == -1) 
		{
			throw new NullPointerException(); 
		}
		else
		{
			return(accounts.get(zachAnsellCodeFixerHelperPleaseHelpIHaveSpentTooLongTryingToFixThis(account)).getBalance());
		}
	}
}
