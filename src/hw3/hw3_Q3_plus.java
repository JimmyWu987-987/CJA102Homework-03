package hw3;

// 阿文很喜歡簽大樂透(1～49)，但他她是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
// 厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
// 的號碼與總數，如圖：
// (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)

import java.util.Arrays; // 引入 Arrays 類別，用於陣列操作，例如 copyOf

public class hw3_Q3_plus {

	/*
	 * main 方法是程式的進入點。 負責取得使用者輸入的不喜歡數字，呼叫核心邏輯方法，並最終顯示可選號碼的總數。
	 *
	 * 執行流程： 
	 * 1. 宣告用於儲存不喜歡數字 (inputNumber) 和輸入的最大選號範圍（NUMBER_RANGE）的變數。 
	 * 
	 * 2. 建立 ScannerObject實例，用於處理使用者輸入。 
	 * 
	 * 3. 提示使用者輸入不想要的個位數字 (1~9)。 
	 * 
	 * 4. 呼叫 ScannerObject 的keyInUnitsDigit() 方法取得輸入，並儲存到 inputNumber。 
	 * 
	 * 5. 呼叫 bangGoSixNumberChoose() 方法，傳入inputNumber (不喜歡的數字) 和 NUMBER_RANGE (最大範圍)。 
	 * 此方法會回傳一個包含阿文可選數字的陣列。 
	 * 
	 * 6. 將bangGoSixNumberChoose() 回傳的陣列傳入 printNumber() 方法 
	 * 
	 * 7. printNumber()方法會印出6組可選號碼，最後，將總數印出在畫面上。
	 */
	public static void main(String[] args) {

		final int NUMBER_RANGE = 49; // 宣告取亂數的範圍為，ＥＸ：1~49
		int inputNumber; // 宣告儲存使用者輸入不喜歡數字

		ScannerObject SO = new ScannerObject(); // 建立 ScannerObject 實例，處理使用者輸入
		System.out.println("阿文你討厭哪個數字？");
		inputNumber = SO.keyInUnitsDigit19(); // 取得使用者輸入的不喜歡數字
		System.out.println("以下是阿文可以選的6組數字：");

		// 呼叫 bangGoNumberchoose 取得符合條件的數字陣列。
		// 回傳值直接導入 printNumberTable
		// 然後將該陣列傳入 printNumberTable 進行顯示。
		printNumber(bangGoSixNumberChoose(inputNumber, NUMBER_RANGE));

	}

	/*
	 * bangGoSixNumberChoose 方法：根據不喜歡的數字和指定範圍，產生可選的大樂透號碼陣列。
	 *
	 * 這個方法會從 1 開始，檢查到 randomNumber 之間的所有數字。 
	 * 它會排除那些個位數或十位數包含指定 hateNumber
	 * 其中會在使用 choseSixNumber 方法，隨機篩選6個已排除掉不喜歡數字的號碼
	 * 最後，回傳篩選出的6組號碼（已排序完）
	 * 
	 *
	 * @param hateNumber 使用者輸入的不喜歡數字 (1 ~ 9)。
	 * 
	 * @param randomNumber 指定的數字範圍上限 (例如：49)。
	 * 
	 * @return 回傳篩選出的6組號碼（已排序完）
	 */
	public static int[] bangGoSixNumberChoose(int hateNumber, int randomNumber) {

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
				// 這邊的numArrays[]陣列為存放已排除不喜歡的數字組合（未整理，有多餘的陣列空間）
				numArrays[validCount++] = currentNum;
			}

			currentNum++; // 檢查下一個數字
		}

		// 使用 Arrays.copyOf 重新調整陣列的大小。
		// 將陣列長度裁剪到實際儲存的有效數字數量 (validCount)。
		// 等號左邊的numArrays[]陣列為存放已排除不喜歡的數字組合（已整理，刪除多餘的陣列空間）
		numArrays = Arrays.copyOf(numArrays, validCount);
		
		// 呼叫 choseSixNumber 取得排除不喜歡數字的6組隨機號碼
		// 等號左邊的numArrays[]陣列為隨機挑選出的6組號碼
		numArrays = choseSixNumber(numArrays);
		
		
		return numArrays; // 回傳挑選完後的陣列
	}

	/*
	 * choseSixNumber 方法：隨機篩選出6個陣列內的值
	 *
	 * 此方法是給 bangGoSixNumberChoose 使用的方法。
	 * 目的在於將 bangGoSixNumberChoose 內所篩選出已排除不喜歡的數字組合，做隨機篩選出6組號碼
	 * 最後，將陣列排序數字由小排到大，並回傳篩選出的6組號碼。
	 *
	 * @param numArrays 已排除不喜歡的數字組合
	 * 
	 * @return 回傳篩選出的6組號碼
	 */
	
	public static int[] choseSixNumber(int[] numArrays) {
		
		int randowIndexNum = 0; // 作為存放一個『亂數索引值』。
		int tempCount; // 計數器作為為計算輸出6個數字
		int[] tempArray = new int[6]; // 暫存陣列，將隨機挑出的陣列資料儲存至此暫存陣列
		
		
		// 做一個亂數索印值，變成陣列[亂數索印]，選六個不重複的數值並排序，最後印出。
		for (tempCount = 0; tempCount < tempArray.length; tempCount++) {
			randowIndexNum = (int) (Math.random() * numArrays.length);
			
			if (numArrays[randowIndexNum] == 0) {
				tempCount--;
				continue;
			} else {
				tempArray[tempCount] = numArrays[randowIndexNum];
				// 表示此陣列數值已取出。
				numArrays[randowIndexNum] = 0;
			}
		}
		// 使用 Arrays.copyOf 重新調整陣列的大小。
		// 將陣列長度裁剪到實際儲存的有效數字數量 (tempCount)。
		numArrays = Arrays.copyOf(tempArray, tempCount);
		
		// 排序此陣列
		Arrays.sort(numArrays);
		
		return numArrays; // 回傳隨機6個數值的陣列
	}

	/*
	 * printNumber 方法：印出6組可選的樂透號碼。
	 *
	 * 這個方法會接收一個來自 bangGoSixNumberChoose() 的陣列。
	 *
	 * @param numArrays 回傳阿文可選數字的陣列，此陣列索印值必為0~5。
	 * 
	 * @return void沒有回傳值
	 */
	public static void printNumber(int[] numArrays) {
		for (int i = 0; i < 6; i++) {
			// 印出當前索引的數字。
			System.out.print(numArrays[i] + ", ");
		}
	}
}