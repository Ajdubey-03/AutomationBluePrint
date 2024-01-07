package oops_7th_jan_2024;

public class BankingAccount {

	String bankName;
	int balance;
	String bankCode;
	
	
	public BankingAccount(){
		bankName ="SBI";
		bankCode ="SBI001";
		System.out.println("I am deafult constructer");
	}
	
	public BankingAccount(String bankName, String bankCode) {
		this.bankCode =bankCode;
		this.bankName=bankName;
	}
	
	public void getInfo() {
		System.out.println("Bank name :->  " + bankName);
		System.out.println("Bank code :->  " + bankCode);
		System.out.println("balance :->  " + balance);
	}

	
}
