package oops_13_Jan_2024.Inteface.chapter_11_practiceSet;

public class MySmartPhone  
{
public static void main(String[] args) {
	
	MyCellPhone mp = new Samsung(); // We can not created object of interface classes but can used as refrence;
	mp.calling(987665432);
	mp.pickupCall(9876666);
	
	Samsung s = new Samsung();
	s.recentCall();
//	mp.recentCall();  can not recongnize by using Interface class refernces
	s.sonyMusic();
	
	Sony s1 = new Samsung();
	s1.sonyMusic();
	s.setModel("Samsung");
	s.setSize(15);
	s.Modelinfo(s.getModel(), s.getSize());
}
}


interface MyCellPhone{
	int a=25;        // By default attributes of interface calss is private and static 
	void calling(int num);  //Interface allow only method definintion only not body and by default it public
	void pickupCall(int num); 
	
	// inteface class can be inhertis by using impliments keyword class
	// Multiple interface can impliments by the Class
	// Class also can extend by child class can impliments other interface
	
		
}


class Samsung extends BasicPhone implements MyCellPhone , Sony
{



	@Override
	public void calling(int num1) {
		System.out.println("Calling to ...."+ num1);
		
	}


	@Override
	public void pickupCall(int num) {
		System.out.println("Phone is Ringing .....number is"+num);
		
	}
	
	// Class can create own concreate class
	
	public void recentCall() {
		System.out.println("No record found yet.....");
	}


	@Override
	public void sonyMusic() {
		System.out.println("Best Music phone by Sony...");
		
	}
	
}


interface Sony
{
	void sonyMusic();
}





 class BasicPhone{

	private String model;
	private int size;
	 public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}




	  
	  
	
	
	public void Modelinfo( String Model, int display) 
	
	{
		System.out.println("Model Name :: " +Model  + " Display Size is :: " +display);
	}
	 
}


