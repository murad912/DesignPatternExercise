package Facade;

public class TestBankAccount {
	public static void main(String[] args){
		
		         
		        BankAccountFacad accessingBank = new BankAccountFacad(12345678, 1234);
		
		        accessingBank.withdrawCash(50.00);
		
		        		
		        accessingBank.withdrawCash(990.00);
		
		      
		    }

}
