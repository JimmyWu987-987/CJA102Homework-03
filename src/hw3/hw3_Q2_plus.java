package hw3;

/*
玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息
(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
*/
public class hw3_Q2_plus {
	public static void main(String[] args) {

		int answerNumber;

		answerNumber = setRandomNum(100);// 將0~100產生的亂數儲存至answerNumber

		System.out.println("數字猜猜看！請輸入0~100任意數字！");
		countinuousScan(answerNumber);// answerNumber傳給此方法做猜數字

	}

	/*
	 * 將產生的解答數字與鍵盤輸入的值，一起做判斷的方法，猜對與猜錯都會有相對應的文字輸出。
	 */
	public static void countinuousScan(int ansNum) {
		ScannerObject SO = new ScannerObject();
		int date;
		do {
			date = SO.KeyIn();

			if (date == ansNum) {
				System.out.println("恭喜你猜對了!");
				break;

			} else if (date > ansNum) {
				System.out.println("猜錯囉！溫馨提醒你猜的比較大！");
			} else {
				System.out.println("猜錯囉！溫馨提醒你猜的比較小！");
			}

		} while (true);

	}

	/*
	 * setRandomNum 方法
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
