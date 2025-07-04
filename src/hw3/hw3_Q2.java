package hw3;

//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：

public class hw3_Q2 {
	public static void main(String[] args) {

		final int NUMBER_RANGE = 9;		// 宣告數字範圍為0到NUMBER_RANGE, EX:0~9
		int answerNumber; // 要猜中的數字

		answerNumber = setRandomNum(NUMBER_RANGE);// 將0~9產生的亂數儲存至answerNumber

		System.out.println("數字猜猜看！請輸入0~9任意數字！");
		countinuousScan(answerNumber);// answerNumber傳給此方法做猜數字

	}

	/*
	 * countinousScan 方法：輸入要文字猜猜看
	 * 
	 * 
	 * KeyIn()詳見ScannerObject.java 將產生的解答數字與鍵盤輸入的值，一起做判斷的方法，猜對與猜錯都會有相對應的文字輸出。
	 */
	public static void countinuousScan(int ansNum) {
		ScannerObject SO = new ScannerObject();
		int date;
		do {
			date = SO.setkeyInUnitsDigit09();
			if (date == ansNum) {
				System.out.println("恭喜你猜對了!");
				break;
			} else {
				System.out.println("猜錯囉!");
			}

		} while (true);

	}

	/*
	 * setRandomNum 方法：產生一個要猜中的數字。
	 * 
	 * 用Math.random 方法，產生出一個指定範圍的整數，並回傳此整數。
	 * 
	 * @param rangeNumber 要亂數的數字範圍，範圍為 0 ~ (rangeNumber)
	 * @return 要猜中的數字 
	 */
	public static int setRandomNum(int rangeNumber) {
		
		int num;	// 要猜中的數字
		
		// 亂數產生一個範圍為 0 ~ (rangeNumber)的數字
		num = (int) ((Math.random() * (rangeNumber + 1)));

		return num;	// 回傳要猜中的數字
	}
}
