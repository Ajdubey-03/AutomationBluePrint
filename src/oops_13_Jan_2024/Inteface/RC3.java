package oops_13_Jan_2024.Inteface;

public class RC3 {

	public static void main(String[] args) {
		
		vehCompany vc = new vehCompany("Safari", 1995, "By TATA");
		//vc.accelaterSystem();
		System.out.println(vc.getOrgBy());
		System.out.println(vc.ModelLaunchYear());
		System.out.println(vc.getModelName());
		System.out.println(vc.gearSystem(0));
		vc.twoWheeler();
		
		

	}

}
