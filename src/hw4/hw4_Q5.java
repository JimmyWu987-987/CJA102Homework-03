
package hw4;
/*
 * 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
 * 例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
 * (提示1：Scanner，陣列)
 * (提示2：需將閏年條件加入)
 * (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
 */


public class hw4_Q5 {

	static {
		System.out.println("計算輸入之日期為該年的第幾天。");
	}
	
	

	public static void main(String[] args) {
		
		// 輸入並顯示出輸入的日期（有大小月、閏年的判斷）
		hw4_Q5_method1 dayOfTheYear = new hw4_Q5_method1();
		
		dayOfTheYear.setWhatDayOfTheYearIsThisDate();
		dayOfTheYear.printWhatDayOfTheYearIsThisDate();
		
		hw4_Q5_method1 today =new hw4_Q5_method1();
		today.setWhatDayOfTheYearIsThisDate();
		today.printWhatDayOfTheYearIsThisDate();
			
		
		
//		DayOfTheYear.setEnteYear();
//		DayOfTheYear.setEnteMonth();
//		DayOfTheYear.setEnterDay();
//		DayOfTheYear.printDate();		
//		DayOfTheYear.setDayOfTheMonthArrays();
		
		
	}

}
