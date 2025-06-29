package hw3;

import java.util.Arrays;

//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形，如圖示結果：

public class hw3_Q1 {
	public static void main(String[] args) {

		int[] input = new int[3];
//		int output = 0;
		ScannerObject SO = new ScannerObject();

		System.out.println("請輸入3個數字,輸入完後請按Enter：");

		for (int i = 0; i < input.length; i++) {
			input[i] = SO.KeyIn();
//			output += input[i];
		}
		//先做由小至大的排序,這樣保證input[2]就是最長邊
		Arrays.sort(input);

		if ((input[0] + input[1]) > input[2]) { // 最小兩邊和 > 最長邊 為三角形
			if (input[0] == input[1]) {
				System.out.println("等腰三角形");
			} else if (input[0] == input[2]) {
				System.out.println("正三角形");
			} else if (pythThm(input[0], input[1], input[2])) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}

		} else {
			System.out.println("不是三角形");
		}

	}

	public static boolean pythThm(int a, int b, int c) { 
		// c為最長邊
		// 利用畢氏定理判斷是否為直角三角形
		
		if ((c * c) == ((a * a) + (b * b))) {
			return true;
		} else {
			return false;
		}
	}

}
