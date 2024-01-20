package oops_13_Jan_2024.abstractions.BrowsersActions;

public class FirefoxBrowser extends BaseClass{

	@Override
	public void openBrowser() {
		
		System.out.println("FireFox is opening...");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("FireFox is closing...");
		browserClose("abc");
		
	}

}
