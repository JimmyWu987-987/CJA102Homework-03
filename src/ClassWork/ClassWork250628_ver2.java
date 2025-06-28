package ClassWork;

//• 請分別建立x, y, z三個3x3的int陣列，然後把x和y陣列的加總存放到z陣列裡，
//再將結果顯示於螢幕上
//• x和y陣列中的數字：
//• 請用亂數產生介於0～30之間的整數
//• 亂數之取得可參考 java.lang.Math的靜態方法 random()
//• public static double random()
//．傳回亂數值其範圍為0.0～1.0

public class ClassWork250628_ver2 {

	public static void main(String[] args) {

		ClassWork250628_ver2 obj1 = new ClassWork250628_ver2();
		int[][] x = obj1.getRandomArray(3, 3);
		int[][] y = obj1.getRandomArray(3, 3);
		int[][] z = new int[3][3];

		System.out.println("======X Array=====");
		obj1.printArray(x);
		System.out.println("======Y Array=====");
		obj1.printArray(y);
		
		System.out.println("======Z Array=====");

		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
				System.out.print(z[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public int[][] getRandomArray(int num1, int num2) {
		int[][] date = new int[num1][num2];

		for (int i = 0; i < date.length; i++) {
			for (int j = 0; j < date[i].length; j++) {
				date[i][j] = (int) (Math.random() * 31);
			}
		}
		return date;
	}

	public void printArray(int[][] date) {
		for (int i = 0; i < date.length; i++) {
			for (int j = 0; j < date[i].length; j++) {
				System.out.print(date[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
