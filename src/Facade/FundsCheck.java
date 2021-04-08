package Facade;

public class FundsCheck {

	private double cashInAccount = 10000;
	
	public double getCashInAccount() { return cashInAccount;}
	public void decreaseCashInAccount(double cashWithdraw) {
		cashInAccount-= cashWithdraw;
	}
	public void increaseCashInAccount(double cashDposited) {
		cashInAccount+= cashDposited;
	}
	
	public boolean haveEnoughMoney(double cashToWithdrawal) {
		if(cashToWithdrawal > getCashInAccount()) {
			System.out.println("Error: yogu don't have enough money");
			System.out.println("Current: " + getCashInAccount());
			
			return false;
		}else {
			decreaseCashInAccount(cashToWithdrawal);
			System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount());
			return true;
		}
	}
	public void makeDeposit(double cashToDeposit) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposit Complete: Current is "  + getCashInAccount());
		
	}
}
