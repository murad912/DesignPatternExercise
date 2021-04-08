package Facade;

public class BankAccountFacad {
	
	private int accountNumber;
	private int securityCode;
	
	AccountNumberChek acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	WelcomeToBank bankWelcome;
public BankAccountFacad(int newAcctNum, int newSecCode) {
	accountNumber = newAcctNum;
	securityCode = newSecCode;
	
	bankWelcome = new WelcomeToBank();
	acctChecker = new AccountNumberChek();
	codeChecker = new SecurityCodeCheck();
	fundChecker = new FundsCheck();
	}

public int getaccountNumber() { return accountNumber; }
public int getSecurityCode() { return securityCode;}

public void withdrawCash(double cashToGet) {
	if(acctChecker.accountActive(getaccountNumber()) &&
			codeChecker.isCodeCorrect(getSecurityCode())&&
					fundChecker.haveEnoughMoney(cashToGet)) {
		System.out.println("Transaction Complete\n");
		
	}else {
		System.out.println("Transaction Failed");
	}
}

}
