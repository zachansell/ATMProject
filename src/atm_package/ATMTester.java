package atm_package;
public class ATMTester {
	public static void main (String [] args)
	{
		ATM jeremiah = new ATM (); 
		System.out.println(jeremiah.deposit("Winfrey", 25159684372.43));
		System.out.println(jeremiah.deposit("Bezos", 193495330293.43));
		System.out.println(jeremiah.deposit("Bezos", 20394353.35));
		System.out.println(jeremiah.withdraw("Bezos", 3593293.66));
		System.out.println(jeremiah.deposit("MrTheiss",64033.55));
		System.out.println(jeremiah.withdraw("MrTheiss", 443964.46));
		System.out.println(jeremiah.checkBalance("Bezos"));
		System.out.println(jeremiah.checkBalance("YoMama")); 
		System.out.println((jeremiah.checkBalance("Winfrey")));
		System.out.println(jeremiah.checkBalance("MrTheiss"));
	}
}
