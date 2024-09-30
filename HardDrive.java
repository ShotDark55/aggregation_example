package aggrigation;

public class HardDrive {
	
	
	
	private String company;
	private int storage;
	public String type;
	
	
	
	
	public void setHardDrive(String company,int storage,
			String type) {
		
		this.company = company;
		this.storage = storage;
		this.type = type;
		
	}
	
	
	public String getHardDrive() {
		
		return("storage : " + storage + "\ntype : " + 
	type + "company name : " + company);
	}

}
