package entities;

public class SavingsAcountPlus extends SavingsAcount{
	//The type SavingsAcountPlus cannot subclass the final class SavingsAcount
	
	@Override
	public void withdraw(double amount) {
		balance -= amount + 2;
	}
	
	/*Multiple markers at this line
	- overrides entities.SavingsAcount.withdraw
	- Cannot override the final method from 
	 SavingsAcount*/
}
