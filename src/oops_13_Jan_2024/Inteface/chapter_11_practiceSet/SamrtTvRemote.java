package oops_13_Jan_2024.Inteface.chapter_11_practiceSet;

public interface SamrtTvRemote extends TVRemote {
	
	
	private String[] remoteDetails(int size) 
	{
	 String[]remote = new String[size];
	 remote[0] = "Company : Sony";
	 remote[1]="Recharge Tyep: Chargable Battery";
	 remote[2]="Battery Support : dual battery";
	 remote[3]="range :10 MTRs";
	 remote[4]= "Warranty : 2years Service waranty";
	 remote[5]="Model Suppored : M1,M2,M3";
	 return remote;
	}


	
	default void getInfo() {
		String remote[]=remoteDetails(6);
		for(int i =0; i<remote.length; i++) 
		{
			System.out.println(remote[i]);
		}
		for(Object rm: remote) {
			System.out.println(rm);
		}
	}

	void searhChannel(String name);
	void wifi(String wifi);
	void netSurfing();
	
  default void wifiRange(int dis) {
		if(range(dis))
		{
			System.out.println("Connected");
		}else 
		{
			System.out.println("Out of range, Allowed range : 10 mtr");
		}
	}
  
  
}
