package Scuba.javatraining;

public class Encapsulation {

	//Employee Details
	
	private String empName;
	private int empID;
	private String companyName;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	public static void main(String[] args) {
	       
		Encapsulation emp=new Encapsulation();
        emp.setEmpName("Sindhuja Marimuthu");
        emp.setEmpID(2916);
        emp.setCompanyName("Maveric.");
       
        System.out.println("The employee name: " +emp.getEmpName() +" ; ID: "+emp.getEmpID()+ " ; Company Name: " +emp.getCompanyName());
       
   }
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
