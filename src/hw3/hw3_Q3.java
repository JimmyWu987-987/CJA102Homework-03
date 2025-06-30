package hw3;

//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖：
import java.util.Arrays;

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
	 * 1.可以設定1~(randomNumber)的之間範圍數值，並將整數存放置最大索引值為(randomNumber)的陣列裡。
	 * 2.不喜歡的數字(hateNumber)能夠判斷個位數（用%）以及十位數（用/）是否有(hateNumber)的存在。
	 * 3.使用無窮迴圈是為了製作出可以彈性選擇的數值範圍與討厭的數字。例如可以選範圍1~100
	 * 4.『count』計算(randomNumber)最大範圍，例如最大值為49，計算到當count=49,則跳出迴圈並回傳陣列。
	 * 5.『i』則是計算要存入陣列的索引值，確保能夠連續儲存至陣列。
	 * 6.此方法也能排序陣列，存放最大數值(randomNumber)之後的陣列，陣列內的數值皆為『0』
	 * 7.預留一個numArrays[i+1]的值，內容為「０」，給numberTable()做作業指定的排序
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
		numArrays = Arrays.copyOf(numArrays, i+1);

		return numArrays;

	}

	/*
	 * 1.依照作業要求的排序方式 
	 * 2.count1計算可以選擇的數字數量 
	 * 3.count2為設定6個數字之後換行
	 * 4.因為bangGoNumberchoose排序過的關係，numArrays[最大索引+1]的值，內容為「0」
	 * 5.呈(4)，藉由(umArrays[count1] == 0），印出最後的print並跳出無窮回權。
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
