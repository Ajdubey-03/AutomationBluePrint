package oops_13_Jan_2024.Inteface;

public interface Vehicles extends VehiclesType {

	void accelaterSystem();
	void breakingSystem();
	void cluthSystem();
	
	
	default String gearSystem(int gearNo){
		String gNo="";
		if(gearNo>0 && gearNo <=4) 
		{
			gNo = "Car is now ::" + gearNo+ "th";
			
		}else if(gearNo==5)
		{
			 gNo = "Car is now ::" +"Reverse Gear";
		}
		else if(gearNo==0) 
		{
			gNo = "Car Nutral year...";
		}
		return gNo;
	}
	
		
	
}


interface VehiclesType{
	void twoWheeler();
	void threeWheeler();
	void fourWheeler();
	void hewvyWheeler();
}

