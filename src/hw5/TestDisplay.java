package hw5;

public class TestDisplay {
	public static void main(String[] args) {
		Display[] hw5 = new Display[2];
		hw5[0] = new starSquare();
		hw5[1] = new randAbg(10, 100);
		
		for (int i = 1; i < hw5.length; i++) {
			hw5[i].display();
			System.out.println("-----------------------");
		}
	}
}
