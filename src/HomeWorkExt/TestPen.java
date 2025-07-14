package HomeWorkExt;

public class TestPen {
	public static void main(String[] args) {
		Pencil pencil = new Pencil("SKB", 10);
		pencil.write();
		System.out.println("單價為八折：" + pencil.getPrice());
		
		InkBrush inkBrush = new InkBrush("xxx",10);
		inkBrush.write();
		System.out.println("單價為九折：" + inkBrush.getPrice());
		
		
	}
}