package oops_13_Jan_2024.abstractions.BrowsersActions;

public class ChromeBrouser extends BaseClass{

	@Override
	public void openBrowser() {
		
		System.out.println("Chrome Browser is opening here.......");
		System.out.println(getClass().toString());
	
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome Browser is Closing here.......");
		browserClose("xyz"); //concrete methods from the BaseClass
		
	}

}
