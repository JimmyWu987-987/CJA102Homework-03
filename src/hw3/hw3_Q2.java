package hw3;

//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：

public class hw3_Q2 {
	public static void main(String[] args) {

		int input, output = 0;
		ScannerObject SO = new ScannerObject();
		output = (int) ((Math.random() * 9) + 1);

		System.out.println("數字猜猜看！請輸入0~9任意數字！");
		do {
			input = SO.KeyIn();
		}while(true);
		
	}
}
