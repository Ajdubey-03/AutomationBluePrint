package oops_13_Jan_2024.Inteface.chapter_11_practiceSet;

public class PracticeRC {

	public static void main(String[] args) {
		
		FountainPen Fp = new FountainPen();
		Fp.changeNib();
		
	//	BasicAnimal ba = new BasicAnimal   ---->> not allowed, Object can't be creted of the interface 
		
		Human  h = new Human();
		h.bite();
		h.sleep();
		h.eat();
		h.jump();
		
		Monkey m = new Human();
	//	m.eat();  -->> not allowed
	//	m.sleep(); --->> not allowed thease are related to Human class 
		
		BasicAnimal ba = new Human();
		ba.sleep();
		ba.eat();
		//ba.bite(); -->> not allowd , Not related to BA refrence 
		//ba.jump(); -->> not allowed 
		
		
		

		SmartTelephone st = new SmartTelephone();  // It cann access all methods of Smartphone class and Implemented class methods as well
		st.dialNum("9876543210");
		st.ring();
		st.lift();
		st.disconnect();
		st.dialNum("1234567890");
		
		Telephone tl = new SmartTelephone();  // It can only access the Telephones method only can't not access the SmartTelephone methods
	//	tl.recetCall("987654321");  -->> not allowed
		tl.dialNum("987654000");
		tl.ring();
		tl.lift();
		tl.disconnect();
		tl.dialNum("9876543200");   //dialNum can used by 
		
		System.out.println("-----------------------------------------------\n");
		TV tv = new TV();
//		tv.changeChanel();
//		tv.searhChannel("Soni TV");
//		tv.wifi("aj's s21");
//		System.out.println(tv.range(12));
//		tv.wifiRange(15);
//		tv.wifiRange(9);
		tv.getInfo();
	//	tv.remoteDetails();  -->> not allowed due to private access modifier, but can acheived by using this private method any default methods
	}

}
