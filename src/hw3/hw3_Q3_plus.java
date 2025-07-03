package hw3;

// 阿文很喜歡簽大樂透(1～49)，但他她是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
// 厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
// 的號碼與總數，如圖：
// (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)

import java.util.Arrays; // 引入 Arrays 類別，用於陣列操作，例如 copyOf

public class hw3_Q3_plus {

	/*
	 * main 方法是程式的進入點。
	 * 負責取得使用者輸入的不喜歡數字，呼叫核心邏輯方法，並最終顯示可選號碼的總數。
	 *
	 * 執行流程：
	 * 1. 宣告用於儲存不喜歡數字 (inputNumber) 和可選總數 (count) 的變數。
	 * 2. 建立 ScannerObject 實例，用於處理使用者輸入。
	 * 3. 提示使用者輸入不想要的個位數字 (1~9)。
	 * 4. 呼叫 ScannerObject 的 keyInUnitsDigit() 方法取得輸入，並儲存到 inputNumber。
	 * 5. 呼叫 bangGoNumberchoose() 方法，傳入 inputNumber (不喜歡的數字) 和 49 (最大範圍)。
	 * 此方法會回傳一個包含阿文可選數字的陣列。
	 * 6. 將 bangGoNumberchoose() 回傳的陣列傳入 numberTable() 方法，進行印出及計數。
	 * 7. numberTable() 方法會印出所有可選號碼，並回傳這些號碼的總數。
	 * 8. 最後，將總數印出在畫面上。
	 */
	public static void main(String[] args) {

		int inputNumber, totalCount; // 宣告儲存使用者輸入不喜歡數字及可選號碼總數的變數

		ScannerObject SO = new ScannerObject(); // 建立 ScannerObject 實例，處理使用者輸入
		System.out.println("阿文你討厭哪個數字？");
		inputNumber = SO.keyInUnitsDigit19(); // 取得使用者輸入的不喜歡數字
	    System.out.println("以下是阿文可以選的數字：");
		// 呼叫 bangGoNumberchoose 取得符合條件的數字陣列，
		// 然後將該陣列傳入 numberTable 進行顯示與計數。
		totalCount = numberTable(bangGoNumberchoose(inputNumber, 49));

		System.out.println("總共有 " + totalCount + " 個數字可選。"); // 印出最終可選號碼的總數
	}

	/*
	 * bangGoNumberchoose 方法：根據不喜歡的數字和指定範圍，產生可選的大樂透號碼陣列。
	 *
	 * 這個方法會從 1 開始，檢查到 randomNumber 之間的所有數字。
	 * 它會排除那些個位數或十位數包含指定 hateNumber 的數字。
	 *
	 * @param hateNumber 使用者輸入的不喜歡數字 (1 ~ 9)。
	 * @param randomNumber 指定的數字範圍上限 (例如：49)。
	 * @return 一個包含所有符合條件 (不含 hateNumber) 的數字的整數陣列。
	 * 陣列的實際長度會精確到最後一個有效數字的索引 + 1，並以 '0' 作為終止標記。
	 */
	public static int[] bangGoNumberchoose(int hateNumber, int randomNumber) {

		int validCount = 0; // 計算陣列的索引值，用於計算有效數字在 numArrays 中的索引，也表示目前已找到的有效數字數量
		int currentNum = 1; // 輸入當前的數字存入陣列，從 1 開始檢查的當前數字

		// 初始化一個與最大範圍相同大小的陣列。
		// 這個陣列可能比實際需要的長，因為有些數字會被過濾掉。
		int[] numArrays = new int[randomNumber];

		// 使用無限迴圈來遍歷數字，直到達到指定的最大範圍。
		// 這種方式可以靈活處理不同的 randomNumber 範圍。
		while (true) {
			// 判斷是否已檢查完所有指定範圍內的數字
			if (currentNum > randomNumber) {
				break; // 超過範圍，跳出迴圈
			}

			// 使用模運算符 (%) 判斷個位數，使用整數除法 (/) 判斷十位數。
			// 如果當前數字的個位數或十位數是 hateNumber，則跳過這個數字。
			if (!(currentNum % 10 == hateNumber || currentNum / 10 == hateNumber)) {
				// 如果數字符合條件（不包含 hateNumber），則將其存入陣列。
				// validCount 會作為索引，存入後自動遞增，確保連續儲存。
				numArrays[validCount++] = currentNum;
			}

			currentNum++; // 檢查下一個數字
		}

		// 使用 Arrays.copyOf 重新調整陣列的大小。
		// 將陣列長度裁剪到實際儲存的有效數字數量 (validCount)。
		// 並額外預留一個位置 (validCount)，這個位置的內容會是 Java 預設值 '0'，
		// 作為後續 numberTable() 方法的終止標記，方便其判斷陣列的有效內容結束。
		numArrays = Arrays.copyOf(numArrays, validCount + 1);

		return numArrays; // 回傳包含符合條件數字的陣列
	}

	/*
	 * numberTable 方法：印出可選的樂透號碼，並計算其總數。
	 *
	 * 這個方法會接收一個來自 bangGoNumberchoose() 的陣列，
	 * 依照每行 6 個數字的格式印出，並計算有效數字的總數量。
	 *
	 * @param numArrays 包含阿文可選數字的陣列，末尾有一個 '0' 作為結束標記。
	 * @return 可選數字的總數。
	 */
	public static int numberTable(int[] numArrays) {

		int actualCount = 0; // 實際可選數字的總計數量
		int lineCount = 0;   // 用於控制每行印出的數字數量，達到 6 個就換行

		// 使用無限迴圈來遍歷陣列，直到遇到 '0' 作為陣列內容的結束標記。
		// 這種方式依賴於 bangGoNumberchoose 方法預留的 '0' 終止符。
		while (true) {
			// 印出當前索引的數字，並用定位點符號 (\t) 保持間距。
			System.out.print(numArrays[actualCount] + "\t");

			actualCount++; // 每次印出一個數字，總數就遞增
			lineCount++;   // 每次印出一個數字，行計數也遞增

			// 檢查是否已印出 6 個數字，如果是，就換行。
			if (lineCount == 6) {
				System.out.println(); // 換行
				lineCount = 0;        // 重置行計數器
			}

			// 檢查下一個數字是否為 '0'。
			// 如果是 '0'，表示已達到 bangGoNumberchoose 預留的結束標記，
			// 代表所有有效數字都已印出，可以跳出迴圈。
			if (numArrays[actualCount] == 0) {
				break; // 跳出迴圈
			}
		}
		// 額外處理：如果最後一行不滿 6 個，但迴圈結束了，也需要確保有一個換行。
		// 這樣可以避免後續的「總共有 xx 個數字可選。」緊跟在最後一個數字後面。
		if (lineCount != 0) { // 如果最後一行有印數字，但沒有滿6個導致沒換行
			System.out.println(); // 則補一個換行
		}
		
		return actualCount; // 回傳實際計算出的可選數字總數
	}
}