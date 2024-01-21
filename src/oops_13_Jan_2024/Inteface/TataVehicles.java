package oops_13_Jan_2024.Inteface;

public class TataVehicles  {

	private String modelName;
	private int launchYear;
	private String orgBy;
	
	public String getModelName() {
		return modelName;
	}
	
/*	public int getLaunchYear() {
		return launchYear;
	}
*/	
	public String getOrgBy() {
		return orgBy;
	}
	

	
	 public TataVehicles( String modelName,int launchYear, String orgBy){
		this.launchYear=launchYear;
		this.modelName=modelName;
		this.orgBy=orgBy;
	}
	

	
	public int ModelLaunchYear() {
		return launchYear;
	}
	
	
}
