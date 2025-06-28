package hw3;

//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形，如圖示結果：

public class hw3_Q1 {
	public static void main(String[] args) {

		int[] input = new int[3];
		int output = 0;
		ScannerObject SO = new ScannerObject();

		System.out.println("請輸入3個數字：");

		for (int i = 0; i < input.length; i++) {
			input[i] = SO.KeyIn();
			System.out.println("out:" + input[i]);
		}

		
	}

}
