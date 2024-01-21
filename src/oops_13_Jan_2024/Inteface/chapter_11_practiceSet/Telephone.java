package oops_13_Jan_2024.Inteface.chapter_11_practiceSet;

public abstract class Telephone {

	abstract void ring();
	abstract void lift();
	abstract void disconnect();
	
	public  void dialNum(String no){
		System.out.println("Dialing number by Telephone class :: " + no);
	}
	
	
}
