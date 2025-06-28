package ClassWork;

//• 請分別建立x, y, z三個3x3的int陣列，然後把x和y陣列的加總存放到z陣列裡，
//再將結果顯示於螢幕上
//• x和y陣列中的數字：
//• 請用亂數產生介於0～30之間的整數
//• 亂數之取得可參考 java.lang.Math的靜態方法 random()
//• public static double random()
//．傳回亂數值其範圍為0.0～1.0

public class ClassWork250628 {

	public static void main(String[] args) {
		int x[][] = new int[3][3];
		int y[][] = new int[3][3];
		int z[][] = new int[3][3];

		System.out.println("====X陣列====");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = (int) (Math.random() * 31);
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("====Y陣列====");

		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				y[i][j] = (int) (Math.random() * 31);
				System.out.print(y[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("====Z陣列====");

		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
				System.out.print(z[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
