package oops_13_Jan_2024.abstractions.BrowsersActions;

public abstract class BaseClass {

	public abstract void openBrowser();
	public abstract void closeBrowser();
	
	
	public void browserClose(String browserName) //concrete methods
	{
		System.out.println("Closiing the System..." + browserName);
	}

}
