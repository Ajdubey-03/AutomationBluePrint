package oops_7th_jan_2024;

public class Lab0082 {

	public static void main(String[] args) {
		
		BankingAccount s1 = new BankingAccount();
		s1.getInfo();
		
		System.out.println("----------------  ------  ------  ------------------");
		
		
		BankingAccount icic = new BankingAccount("ICIC", "ICIC0004321");
		icic.bankCode="ICIC005";  // Parameter arguments overridden by this
		icic.getInfo();
		
		System.out.println("----------------  ------  ------  ------------------");
		
		BankingAccount yes = new BankingAccount("Yes Bank", "Yes01234");
		//yes.bankCode="ICIC005";  // Parameter arguments overridden by this
		yes.getInfo();

	}

}
