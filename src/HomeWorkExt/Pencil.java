package HomeWorkExt;

public class Pencil extends Pen {
	private double pencilPrice;

	public Pencil() {

	}

	public Pencil(String brand, int price) {
		super(brand, price);
		this.pencilPrice = 0.8 * price;
	}

	public int getPrice() {
		return (int)this.pencilPrice;
	}

	public void write() {
		System.out.println("削鉛筆");
		super.write();
	}
}
