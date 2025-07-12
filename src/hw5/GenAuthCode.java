package hw5;

public class GenAuthCode {

	// 宣告 int[] randResultArray 作爲存放亂數結果的陣列
	private int[] randResultArray;

	public GenAuthCode(int RAND_ARR_LENGTH) {
		setGenAuthCode(RAND_ARR_LENGTH);
	}

	public void display() {
		char print;
		
		System.out.print("驗證碼為：");
		for (int i = 0; i < randResultArray.length; i++) {
			print = (char) (getGenAuthCode()[i]);
			System.out.print(print);
		}
	}

	// 數字、大寫英文、小寫英文取亂數 的方法
	// 用Math.Random()取亂數
	// Unicode的編碼，用整數找出相對應的字元

	

	public void setGenAuthCode(int RAND_ARR_LENGTH) {

		int[] temprandResultArray = new int[RAND_ARR_LENGTH];
		// 準備兩組Math.Random()
		int randNum = 0;

		// 利用迴圈將亂數結果存放至 randResultArray 陣列裡
		for (int i = 0; i < temprandResultArray.length; i++) {

			// 第一組為選擇要數字、大寫英文、小寫英文
			// 取完後利用switch做判斷，取０～２的亂數，０為數字組合；１為大寫英文組合；２為小寫英文組合
			randNum = (int) (Math.random() * 3);

			// 第二組為各組取指定數字範圍的亂數，將最後結果儲存至變數。
			switch (randNum) {
			case 0:			// （０～９）１０進位：48 ~ 57
				temprandResultArray[i] = (int) (Math.random() * 10) + 48;
				break;
			case 1:			// （Ａ～Ｚ）１０進位：65 ~ 90
				temprandResultArray[i] = (int) (Math.random() * 26) + 65;
				break;
			case 2:			// （ a ~ z）１０進位：97 ~ 122
				temprandResultArray[i] = (int) (Math.random() * 26) + 97;
				break;
			}
		}
		randResultArray = temprandResultArray;
	}

	public int[] getGenAuthCode() {
		return this.randResultArray;
	}

}
