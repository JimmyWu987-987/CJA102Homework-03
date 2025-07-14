package HomeWorkExt;

public class Pen {
	private String brand;
	private int price;

	public Pen() {

	}

	public Pen(String brand, int price) {
		
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setprice(int price) {
		this.price = price;
	}
	public int getprice() {
		return this.price;
	}
	
	public void write() {
		System.out.println("寫字");
	}
	
}
