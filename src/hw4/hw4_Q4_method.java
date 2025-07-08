package hw4;

/*
 * 此方法給『hw4.Q4.java做使用』
 * 
 * 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下：
 * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
 * 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
 * (提示：Scanner，二維陣列)
 */

public class hw4_Q4_method {

//	private int[] empNo;

	// 找出是哪個員工的現金大於借款金額，並回傳該員工編號 的方法
	// int[Y][X] = int[5][5]
	// Y員工編號資料，Ｘ為該員工現金資料
	// 回傳值：員工編號
	public void getMeMoney(int ENTER_AMOUNT, int[][] SAL_DATE) {

		int whoCanGetMeMoney = 0;

		System.out.println("有錢可借的員工編號:");

		for (int i = 0; i < SAL_DATE[1].length; i++) {
			if (SAL_DATE[1][i] >= ENTER_AMOUNT) {
				System.out.print(SAL_DATE[0][i] + ", ");
				whoCanGetMeMoney++;
			}
		}
		System.out.println("共 " + whoCanGetMeMoney + " 人");
	}
}
