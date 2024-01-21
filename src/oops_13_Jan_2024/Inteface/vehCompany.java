package oops_13_Jan_2024.Inteface;

public class vehCompany  extends TataVehicles implements Vehicles{

	
	

	public vehCompany(String modelName, int launchYear, String orgBy) {
		super(modelName, launchYear, orgBy);	
	}

	@Override
	public void accelaterSystem() {
	System.out.println("accelerating the cars.......");
	}

	@Override
	public void breakingSystem() {
		System.out.println("breaking the cars.......");
		
	}

	@Override
	public void cluthSystem() {
	System.out.println("Cluths the cars.......");
	}

	@Override
	public void twoWheeler() {
		System.out.println("Contains 2 wheel and allowed 2 persons only.");
		
	}

	@Override
	public void threeWheeler() {
		
		
	}

	@Override
	public void fourWheeler() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hewvyWheeler() {
		
		
	}

}
