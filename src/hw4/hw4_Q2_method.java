package hw4;

/*
 * 此類別是給『hw4_Q2.java』使用
 *
 * 請建立一個字串，經過程式執行後，輸入結果是反過來的
 * 例如String s = “Hello World”，執行結果即為dlroW olleH
 * (提示：String方法，陣列)
 */

public class hw4_Q2_method {

	private String ReverseStrResults;
	
	public hw4_Q2_method(String STR_DATE) {
		char[] temp = STR_DATE.toCharArray(); // 字串轉字元陣列
		char[] tempResults = new char[temp.length];

		for (int i = 0; i < temp.length; i++) {
			tempResults[i] = temp[temp.length - 1 - i];
		}
		
		this.ReverseStrResults = String.valueOf(tempResults); // 字元陣列轉字串
		
		System.out.println("原本的句子為：" + STR_DATE);
		System.out.println("反轉後的句子為：" + this.ReverseStrResults);
	}

	// 做一個 做顛倒的方法
	public void setReverseString(String STR_DATE) {
		char[] temp = STR_DATE.toCharArray(); // 字串轉字元陣列
		char[] tempResults = new char[temp.length];

		for (int i = 0; i < temp.length; i++) {
			tempResults[i] = temp[temp.length - 1 - i];
		}

		this.ReverseStrResults = String.valueOf(tempResults); // 字元陣列轉字串
	}

	public String getsetReverseString() {
		return this.ReverseStrResults;
	}

	// 印出相反的結果
	public void printReverseStrResults(String STR_DATE) {
		System.out.println("原本的句子為：" + STR_DATE);
		System.out.println("反轉後的句子為：" + this.ReverseStrResults);
	}

}
