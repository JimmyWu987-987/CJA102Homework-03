package hw3;

//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖：

public class hw3_Q3 {
	public static void main(String[] args) {

		int inputNumber;
//		keyInUnitsDigit()詳見ScannerObject.java
		ScannerObject SO = new ScannerObject();
		System.out.println("阿文你討厭哪個數字？");
		inputNumber = SO.keyInUnitsDigit();
		
		numberTable(bangGoNumberchoose(inputNumber, 49));

	}

	/*
	 * 可以設定1~(randomNumber)的之間範圍數值，並將整數存放置最大索引值為(randomNumber)的陣列裡。
	 * 不喜歡的數字(hateNumber)能夠判斷個位數（用%）以及十位數（用/）是否有(hateNumber)的存在。
	 * 使用無窮迴圈是為了製作出可以彈性選擇的數值範圍與討厭的數字。例如可以選範圍1~100
	 */
	public static int[] bangGoNumberchoose(int hateNumber, int randomNumber) {

		int count = 1, i = 0;
		int[] numArrays = new int[randomNumber];

		while (true) {
			if (count > randomNumber) {
				break;
			} else if (!(count % 10 == hateNumber || count / 10 == hateNumber)) {
				numArrays[i++] = count;
			}

			count++;
		}

		return numArrays;

	}

	/*
	 * 依照作業要求的排序方式 count1計算可以選的數字數量 count2計算
	 */
	public static void numberTable(int[] numArrays) {

		int count1 = 0, count2 = 0;

		while (true) {

			System.out.print(numArrays[count1] + "\t");
			count1++;
			count2++;

			if (count2 == 6) {
				System.out.println();
				count2 = 0;
			}
			if (numArrays[count1] == 0) {
				System.out.println("總共有 " + count1 + " 個數字可選。");
				break;
			}

		}
	}
}
