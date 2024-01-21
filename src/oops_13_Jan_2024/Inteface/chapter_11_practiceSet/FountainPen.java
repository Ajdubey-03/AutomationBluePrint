package oops_13_Jan_2024.Inteface.chapter_11_practiceSet;

public class FountainPen extends Pen{

	@Override
	void write() {
	System.out.println("just Wroiting...");
		
	}

	@Override
	void refill() {
		System.out.println("Refilling the ink..");
		
	}
	
	public void changeNib() {
		System.out.println("Canging nib of the pen....");
	}

}
