package HomeWorkExt;

public class Pen {
	private String brand;
	private int price;

	public Pen() {

	}

	public Pen(String brand, int price) {
		setBrand(brand);
		setPrice(price);
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	
	public void write() {
		System.out.println("寫字");
	}
}
