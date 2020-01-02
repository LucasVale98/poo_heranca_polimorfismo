package entities;

public final class SavingsAcount extends Acount{

	private Double InterestRate;

	public SavingsAcount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAcount(Integer number, String holder, Double balance, double interestRate) {
		super(number, holder, balance);
		this.InterestRate = interestRate;
	}

	public Double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(Double interestRate) {
		InterestRate = interestRate;
	}	
	
	public void upadateBalance() {
		balance += balance * InterestRate;
	}
	
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
