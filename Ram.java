package aggrigation;

public class Ram {
	
	public int capasity;
	private String company;
	private short ddr;
	
	
	public void setRam(int capasity,short ddr, String company) {
		this.capasity = capasity;
		this.company = company;
		this.ddr = ddr;
	}
	
	
	public String getRam() {
		return("capacity : " + capasity+ "\ngeneration : "
				+ ddr + "Company name :" + company) ;
				
	}

}
