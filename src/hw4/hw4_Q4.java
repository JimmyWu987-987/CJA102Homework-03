package hw4;

/*
 * 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下：
 * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
 * 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
 * (提示：Scanner，二維陣列)
 */

import hw3.ScannerObject;

public class hw4_Q4 {

	// int[Y][X] = int[5][5]
	// Y為員工編號，Ｘ為該員工現金
	private static int[][] SAL_DATE = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
	private static int ENTER_AMOUNT;

	static {
		System.out.println("阿文你要借多少錢？");
	};

	public static void main(String[] args) {
		
		hw4_Q4_method Colleagues =new hw4_Q4_method();
		Colleagues.getMeMoney(getEnterAmount(), SAL_DATE);
		
	}

	// 輸入數字的方法
	// import hw3的scanner 方法
	// 回傳：輸入的金額（借款金額）。
	public static int getEnterAmount() {
		ScannerObject sc = new ScannerObject();
		ENTER_AMOUNT = sc.setKeyIn();

		return ENTER_AMOUNT;
	}

}
