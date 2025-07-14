package HomeWorkExt;

public class InkBrush extends Pen {
	private double inkBrushPrice;

	public InkBrush() {

	}

	public InkBrush(String brand, int price) {
		super(brand, price);
		this.inkBrushPrice = price * 0.9;
	}
	
	public int getPrice() {
		return (int)this.inkBrushPrice;
	}
	
	public void write() {
		System.out.println("沾墨汁");
		super.write();
	}

}
