package oops_13_Jan_2024.Inteface.chapter_11_practiceSet;

public class TV implements SamrtTvRemote {

	@Override
	public void volUp() {
		System.out.println("Voulum increased");
		
	}

	@Override
	public void volDown() {
		System.out.println("Voulum decreseased");
		
	}

	@Override
	public void changeChanel() {
		System.out.println("Channel changed");
		
	}

	@Override
	public void prevChanel() {
		System.out.println("Previous channel");
		
	}

	@Override
	public void searhChannel(String name) {
		System.out.println("Searchin channel : " + name);
		
	}

	@Override
	public void wifi(String nm) {
		System.out.println("Connecting wifi :: "+ nm);
		
	}

	@Override
	public void netSurfing() {
		System.out.println("Google.com");
		
	}

	
}
