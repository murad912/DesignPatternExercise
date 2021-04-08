package Facade;

public class AccountNumberChek {

	private int accountNumber = 12345678;
	public int getAccountNumber() {
		return accountNumber;
	}
	public boolean accountActive(int acctNumTocheck) {
		if(acctNumTocheck == getAccountNumber()) {
			return true;
		}else {
			return false;
		}
	}
}
