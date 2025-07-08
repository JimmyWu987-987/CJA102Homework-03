package hw4;

/*
 * 此類別是給『hw4_Q3.java』使用
 * 有個字串陣列如下 (八大行星)：
 * {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
 * 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
 * (提示：字元比對，String方法)
*/
public class hw4_Q3_method {

	// 所有字串陣列的值，母音的總數量
	private int NumberOfVowelsCount;
	
	public hw4_Q3_method(String[] INPUT_DATE) {
		for (int i = 0; i < INPUT_DATE.length; i++) {
			setSelectNumberOfVowels(INPUT_DATE[i]);
		}
		System.out.println("這組字串陣列的母音單字總共數量為："+ getNumberOfVowelsCount());
	}
	
	public hw4_Q3_method(String INPUT_DATE) {
		setSelectNumberOfVowels(INPUT_DATE);
		System.out.println("這組字串陣列的母音單字總共數量為："+ getNumberOfVowelsCount());
		
		
	}

	// 找出某字串有的母音方法（含重複字搜尋）
	public void setSelectNumberOfVowels(String StringArrayDate) {
		int tempCount = 0;

		// 利用迴圈將某組陣列資料讀出
		for (int i = 0; i < StringArrayDate.length(); i++) {

			// switch找出母音
			// 利用.charAt()方法，依序找出母音在哪一個索引。
			// 假如有母音，則 tempCount 累加
			switch (StringArrayDate.charAt(i)) {
			case 'A':
				tempCount++;
				continue;
			case 'a':
				tempCount++;
				continue;
			case 'E':
				tempCount++;
				continue;
			case 'e':
				tempCount++;
				continue;
			case 'I':
				tempCount++;
				continue;
			case 'i':
				tempCount++;
				continue;
			case 'O':
				tempCount++;
				continue;
			case 'o':
				tempCount++;
				continue;
			case 'U':
				tempCount++;
				continue;
			case 'u':
				tempCount++;
				continue;
			}

		}
		// 將此字串的母音數量，存回總數量的變數。
		this.NumberOfVowelsCount += tempCount;
	}

	// 將字串陣列輸入並讀取所有的字串陣列值有幾個母音的方法
	// 搭配 setSelectNumberOfVowels() 方法
	public void setStrArrIsNumberOfVowels(String[] INPUT_DATE) {

		for (int i = 0; i < INPUT_DATE.length; i++) {
			setSelectNumberOfVowels(INPUT_DATE[i]);
		}

	}

	// 讀取 NumberOfVowels
	public int getNumberOfVowelsCount() {
		return this.NumberOfVowelsCount;
	}
	
	//印出母音的總數量
	public void printNumberOfVowelsCount() {
		System.out.println("這組字串陣列的母音單字總共數量為："+ getNumberOfVowelsCount());
		
	}

}
