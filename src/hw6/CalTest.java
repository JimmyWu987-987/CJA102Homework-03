package hw6;

/*
 * 請設計三個類別Calculator.java，CalException.java與CalTest.java，在Calculator.java裡有個自訂
方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。 CalTest.java執行後，使用者可
以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
1. x與y同時為0，(產生自訂的Cal0Exception例外物件)
2. y為負值，而導致x的y次方結果不為整數
3. x與y皆正確情況下，會顯示運算後結果

*/

public class CalTest {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		try {
			c1.getInputsAndValidate();
			c1.setPower();
			c1.resultPrint();
			
		}finally{
			c1.closeScanner();
		}
	}
}
