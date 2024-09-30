package aggrigation;

public class MainRunClass {
	
	
	public static void main(String[] args) {
		
		
		Computer c = new Computer(1500, false, true);
		
		c.hard_drive.setHardDrive("sony", 500, "hdd");
		c.ram.setRam(8, (short) 4, "kingstone");
		
		
		String resutl = c.getComputerPrice("dollar");
		
		System.out.println(resutl);
		
	}
	
	
	
	
}
