package hw3;

//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：

public class hw3_Q2 {
	public static void main(String[] args) {

		int answerNumber;

		answerNumber = setRandomNum(9);

		System.out.println("數字猜猜看！請輸入0~9任意數字！");
		countinuousScan(answerNumber);		

	}

	public static void countinuousScan(int ansNum) {
		ScannerObject SO = new ScannerObject();
		int date;
		do {
			date = SO.KeyIn();
			if (date == ansNum) {
				System.out.println("恭喜你猜對了!");
				break;
			} else {
				System.out.println("猜錯囉!");
			}

		} while (true);

	}

	/*
	 * 亂數產生0~(rangeNumber)的數字，並回傳。
	 */
	public static int setRandomNum(int rangeNumber) {
		int num;
		num = (int) ((Math.random() * (rangeNumber + 1)));

		return num;
	}
}
