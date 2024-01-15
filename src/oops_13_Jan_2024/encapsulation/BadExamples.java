package oops_13_Jan_2024.encapsulation;

public class BadExamples {

	public static void main(String[] args) {
		AppLoginCred ap =new AppLoginCred("admin","admin");
		
		boolean check =ap.isLoggedIN("admin", "password");
		System.out.println(check);
		ap.setPassword("password");
		boolean check2 =ap.isLoggedIN("admin", "password");
		System.out.println(check2);
	}
	
	
	
	static class AppLoginCred
	{
		private String userName;
		private String Password;
		
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		
		
		public  AppLoginCred(String userName, String Password){
			this.userName=userName;
			this.Password=Password;
		}
		
		public boolean isLoggedIN(String  userName, String Password) {
			if(this.userName.toLowerCase().equals(userName) && this.Password.toLowerCase().equals(Password)) {
				System.out.println("Logged IN!!");
				return true;
			}else {
				System.out.println("Wrong Credentials");
				return false;
			}
		}
	}
	
	
	

}
