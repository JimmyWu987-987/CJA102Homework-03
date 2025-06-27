package hw1;
//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
public class hw1_Q6 {
	public static void main(String[] args) {
		
//		因Java規則，以下數值預設為整數int
		System.out.println("『 5 + 5 』的結果為 " + (5+5));
		//此為整數相加，固 5 + 5 = 10，結果為10
		
		System.out.println("『 5 + ’5‘ 』的結果為 " + (5+'5'));
		//'5'為字元，Unicode用十六近制整數表示為『0035』，轉成十進制整數為『53』
		//固整數相加為 5 + 53 = 58，結果為58。
		
		System.out.println("『 5 + ”5“ 』的結果為 " + (5+"5"));
		//"5"為字串，在Java中字串遇到整數相加，將5(int)自動轉換成"5"(String)
		//固 "5" + "5" = "55"，結果為"55"(String)
		
	}

}
