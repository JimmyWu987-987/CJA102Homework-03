package hw3;

import java.util.Arrays;
/*
請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
三角形、其它三角形或不是三角形，如圖示結果：
*/

public class hw3_Q1 {
	public static void main(String[] args) {

		int[] input = new int[3];

		System.out.println("請輸入3個數字（以空白分隔）,輸入完後請按Enter：");

		input = getScannerCount(input.length);// 將鍵盤輸入的資料儲存至input陣列
		Arrays.sort(input); // 先做由小至大的排序,這樣保證input[2]就是最長邊
		getTriangleJudge(input[0], input[1], input[2]); // 判斷三角形的方法

	}

	/*
	 * KeyIn()詳見ScannerObject.java
	 * 設定輸入次數的方法，可以設定輸入count次就停止。 停止後將資料return一組陣列。
	 * 
	 */

	public static int[] getScannerCount(int count) {
		int[] date = new int[count];
		ScannerObject SO = new ScannerObject();

		for (int i = 0; i < count; i++) {
			date[i] = SO.setKeyIn();

		}
		return date;
	}

	/*
	 * a, b 為短邊 c 為最長邊。最小兩邊和 > 最長邊為三角形。此方法為判斷三角形的方法
	 */
	public static void getTriangleJudge(int a, int b, int c) {

		if ((a + b) > c) {
			if (a == b) {
				System.out.println("等腰三角形");
			} else if (a == c) {
				System.out.println("正三角形");
			} else if (setPythThm(a, b, c)) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
	}

	/*
	 * 畢氏定理的方法，判斷是否為直角三角形，a, b 為短邊 c 為最長邊。
	 */
	public static boolean setPythThm(int a, int b, int c) {

		if ((c * c) == ((a * a) + (b * b))) {
			return true;
		} else {
			return false;
		}
	}

}
