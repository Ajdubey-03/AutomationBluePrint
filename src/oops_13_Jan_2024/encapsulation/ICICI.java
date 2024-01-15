package oops_13_Jan_2024.encapsulation;

public class ICICI {
	private String name;
	private double bal;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		
		if(bal>0) {
			this.bal = bal;
		}
		else 
		{
			System.out.println("Not Allowed!!");
		}
		
	}
	
	
      public ICICI(String name, double bal){
		this.name=name;
		this.bal=bal;
	}
  
      
     
  
	

}
