package aggrigation;

public class Computer {
	
	Computer(double price,boolean haveRGB , boolean haveARGB) {
		this.price = price;
		this.haveARGB = haveARGB;
		this.haveRGB = haveRGB;
	}
	
	
	private double price;
	private boolean haveRGB;
	private boolean haveARGB;
	
	
	Ram ram = new Ram();
	HardDrive hard_drive = new HardDrive();
	
	
	
	
	private double getPrice() {
		if (ram.capasity>= 8) {
			price+=1000;
			
		}else if(ram.capasity<8) {
			price+=200;
		}
		
		if (hard_drive.type.equals("ssd")) {
			price+=1000;
		}else {
			price+= 100;
		}
		
		if (haveARGB) {
			price+= 1500;
		}
		
		if (haveRGB) {
			price+= 500;
		}
		
		return price;
	}
	
	
	
	
	
	public String getComputerPrice(String currency) {
		String str = "";
		if (currency.equals("dollar") || currency.equals("$")) {
			str = "$";
		}
		
		if (currency.equals("dinnar") || currency.equals("da") || currency.equals("DA")) {
			str = "DA";
		}
		
		if (currency.equals("euro") || currency.equals("€")) {
			str = "€";
		}
			
		
		return getPrice()+" " + str ;
	}
	
	
	
	

}
