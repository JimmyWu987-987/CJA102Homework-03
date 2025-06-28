package ClassWork;

//• 請分別建立x, y, z三個3x3的int陣列，然後把x和y陣列的加總存放到z陣列裡，
//再將結果顯示於螢幕上
//• x和y陣列中的數字：
//• 請用亂數產生介於0～30之間的整數
//• 亂數之取得可參考 java.lang.Math的靜態方法 random()
//• public static double random()
//．傳回亂數值其範圍為0.0～1.0

public class ClassWork250628_ver2 {

//	public static int TwoDimArraycount(int num1, int num2) {
//	}
//	
	public int[][] getRandomArray(int num1, int num2) {
		int array[][] = new int[num1][num2];
		int i, j;

		for (i = 0; i < num1; i++) {
			for (j = 0; j < num2; j++) {
				array[i][j]=(int)(Math.random()*31);
			}
		}
		
		return array;
	}

	public static void main(String[] args) {
//		int x[][] = new int[3][3];
//		int y[][] = new int[3][3];
//		int z[][] = new int[3][3];
		
		getRandomArray x = new getRandomArray();

		System.out.println("======X Array=====");
		
		}
	}

