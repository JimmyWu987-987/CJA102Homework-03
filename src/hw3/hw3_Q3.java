package hw3;

//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖：

public class hw3_Q3 {
	public static void main(String[] args) {

		int inputNumber;
		ScannerObject SO = new ScannerObject();

		inputNumber = SO.KeyIn();
		bangGoNumberchoose(inputNumber);

	}

	public static void bangGoNumberchoose(int hateNumber) {

		int count = 0;
		int NumberTable;

		for (int i = 1; i <= 49; i++) {
			if (!(i % 10 == hateNumber || i / 10 == hateNumber)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("總共有 " + count + " 個數字可以選。");
	}
}
