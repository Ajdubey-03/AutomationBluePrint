package oops_13_Jan_2024.accessModifier.police;

public class Cop {
	
	//access Modifier :-->>  public, protected , Default,private
	//modifier return name_variable
	
	public int gun =10;
	
	public Cop(int gun) 
	{
	this.gun =gun;
	}
	
	
	protected void canIShoot() {
		System.out.println("Yes, i can shoot...");
	}
	

	
	
}
