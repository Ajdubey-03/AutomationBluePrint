package oops_13_Jan_2024.Inteface.chapter_11_practiceSet;

public class SmartTelephone extends Telephone {

	
	
	@Override
	void ring() {
	System.out.println("Phone is Ringing");
		
	}

	@Override
	void lift() {
		System.out.println("Call is connected.... Hello!!");	
		
	}

	@Override
	void disconnect() {
		System.out.println("Bye, Call is Disconnected now.... ");
		
	}
	
	
	//dialNum is using Smartphoenes as well as Tele
	
	public void dialNum(String no) {
		System.out.println("Dialing phone by Smart Telephone class :: " + no);
	}
	
	
	public void recetCall(String st){
		
		System.out.println("last call was : " + st);
	}

	
}
