package hw4;

/*
 * 配合『hw4_Q5.java』使用
 * 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
 * 例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
 * (提示1：Scanner，陣列)
 * (提示2：需將閏年條件加入)
 * (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
 */
import hw3.ScannerObject;

//  此方法為輸入一組日期，並分別存入年月日，有除錯判斷以及閏年判斷。

public class hw4_Q5_method1 {

	private int YEAR;
	private int MONTH;
	private int DAY;
	private boolean leapYear; // 判斷閏年的真假
	private int[] NumOfDaysInEachMonth; // 依大小月不同，存入對應值，例如：1月是DayOfTheMonth[0] = 31
	private int CountOfDays; // 輸入日期為該年度的第幾天

	ScannerObject sc = new ScannerObject();

	public hw4_Q5_method1() {
		int tempYear = 0;

		System.out.print("您要輸入的年：");
		tempYear = sc.setKeyIn();
		setDetermineLeapYear(tempYear);
		this.YEAR = tempYear;

//		-----------
		boolean templeapYear = false;

		if (tempYear % 4 != 0) {
			templeapYear = false; // 不可被4整除者為平年。
		} else if (tempYear % 100 != 0) {
			templeapYear = true; // 可被4整除且不為100整除者為閏年。
		} else if (tempYear % 400 == 0) {
			templeapYear = true; // 可被400整除為閏年
		}
		this.leapYear = templeapYear;

//		-----------	
		int tempMONTH = 0;
		System.out.print("您要輸入的月：");
		while (true) {
			tempMONTH = sc.setKeyIn();
			if (tempMONTH > 12) {
				System.out.println("請重新輸入 1 ~ 12 月的月份。");
				continue;
			} else {
				break;
			}
		}
		this.MONTH = tempMONTH;

//		-----------
		System.out.print("您要輸入的日：");

		switch (this.MONTH) {
		case 2:
			if (leapYear) {
				setAndPrintDayRange(this.MONTH, 29);
				break;
			} else {

			}
			setAndPrintDayRange(this.MONTH, 28);
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			setAndPrintDayRange(this.MONTH, 31);
			break;
		default:
			setAndPrintDayRange(this.MONTH, 30);
			break;
		}

//		-----------	
		System.out.println("-----------------------------------");
		System.out.print("您輸入的日期為西元 " + this.YEAR + " 年 " + this.MONTH + " 月 " + this.DAY + " 日。");

		if (this.leapYear)
			System.out.println("此年為閏年。");
		else
			System.out.println("此年為平年。");

//			-----------	
	}

	// 輸入年份，並判斷是否為閏年
	public void setEnteYear() {

		int tempYear = 0;

		System.out.print("您要輸入的年：");
		tempYear = sc.setKeyIn();
		setDetermineLeapYear(tempYear);
		this.YEAR = tempYear;

	}

	public int getEnteYear() {
		return this.YEAR;
	}

//	判斷是否為閏年
//	計算輸入的年份是否為閏年，其條件為：
//	１.不可被4整除者為平年。
//	２.可被4整除且不為100整除者為閏年。
//	３.可被400整除為閏年。
//	回傳值：true 為閏年，false 為平年。
//  給 setEnteYear() 內部使用
	public void setDetermineLeapYear(int tempYear) {

		boolean templeapYear = false;

		if (tempYear % 4 != 0) {
			templeapYear = false; // 不可被4整除者為平年。
		} else if (tempYear % 100 != 0) {
			templeapYear = true; // 可被4整除且不為100整除者為閏年。
		} else if (tempYear % 400 == 0) {
			templeapYear = true; // 可被400整除為閏年
		}
		this.leapYear = templeapYear;
	}

	public boolean getDetermineLeapYear() {
		return this.leapYear;
	}

	// 輸入月份，會判斷值是否在1~12月之間 的方法
	//
	public void setEnteMonth() {
		int tempMONTH = 0;
		System.out.print("您要輸入的月：");
		while (true) {
			tempMONTH = sc.setKeyIn();
			if (tempMONTH > 12) {
				System.out.println("請重新輸入 1 ~ 12 月的月份。");
				continue;
			} else {
				break;
			}
		}
		this.MONTH = tempMONTH;
	}

	public int getEnteMonth() {
		return this.MONTH;
	}

	// 判斷大小月能數入的日期區間並印出重新輸入 的方法
	// 給 setEnterDay() 內部使用
	private void setAndPrintDayRange(int MONTH, int maxDay) {
		int tempDay = 0;

		while (true) {
			tempDay = sc.setKeyIn();

			if (tempDay <= maxDay) {
				break;
			} else {
				System.out.println("請重新 " + MONTH + " 月份的日期區間。");
				continue;
			}
		}
		this.DAY = tempDay;

	}

	// 判斷大小月，給不同的輸入區間數字的方法
	// 順便將大小月的天數，儲存至陣列
	public void setEnterDay() {
		System.out.print("您要輸入的日：");

		switch (this.MONTH) {
		case 2:
			if (leapYear) {
				setAndPrintDayRange(this.MONTH, 29);
				break;
			} else {

			}
			setAndPrintDayRange(this.MONTH, 28);
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			setAndPrintDayRange(this.MONTH, 31);
			break;
		default:
			setAndPrintDayRange(this.MONTH, 30);
			break;
		}
	}

	public int getEnterDay() {
		return this.DAY;
	}

	// 印出輸入日期的方法
	public void printDate() {
		System.out.println("-----------------------------------");
		System.out.print("您輸入的日期為西元 " + this.YEAR + " 年 " + this.MONTH + " 月 " + this.DAY + " 日。");

		if (this.leapYear)
			System.out.println("此年為閏年。");
		else
			System.out.println("此年為平年。");
	}

	// 用陣列儲存資料，[月份]為陣列長度
	// 運用switch判斷大小月以及２月的天數
	// 依照輸入的月份，動態設定陣列長度
	// 設定完陣列長度以及陣列資量，是給 setWhatDayOfTheYearIsThisDate() 做資料處理
	// 
	private void setNumOfDaysInEachMonth() {
		
		
		int[] tempNumOfDaysInEachMonth = new int[MONTH];

		for (int i = 0; i < tempNumOfDaysInEachMonth.length; i++) {
			switch (i) {
			case 1: // 2月判斷閏月
				if (this.leapYear) {
					tempNumOfDaysInEachMonth[i] = 29;
					break;
				} else {
					tempNumOfDaysInEachMonth[i] = 28;
					break;
				}
			case 0:
			case 2:
			case 4:
			case 6:
			case 7:
			case 9:
			case 11:
				tempNumOfDaysInEachMonth[i] = 31; // 大月的話帶入31
				break;
			default:
				tempNumOfDaysInEachMonth[i] = 30; // 其餘小月帶入30
				break;
			}
		}

		this.NumOfDaysInEachMonth = tempNumOfDaysInEachMonth;
	}

	public int[] getNumOfDaysInEachMonth() {
		return this.NumOfDaysInEachMonth;
	}

	/*
	 * 計算輸入的日期為當年第幾天 的方法 
	 * 
	 * 狀況（１）輸入月份為１月: 
	 * 不會載入 setNumOfDaysInEachMonth()
	 * 只需知道輸入日期是幾號就是第幾天。 
	 * 
	 * 狀況（２）輸入日期不為１月
	 * 載入 setNumOfDaysInEachMonth() 
	 * 只累加取到輸入月份的前一個月的陣列值（當月不計算）
	 * 最後再加上 輸入日期為幾號 就是該年的第幾天
	 */
	public void setWhatDayOfTheYearIsThisDate() {

		int tempCountOfDays = 0;

		if (this.MONTH == 1) {
			// 輸入日期為１月份的話，不需要取陣列資了的值。
			tempCountOfDays += this.DAY;
		} else {
			setNumOfDaysInEachMonth();
			// 只取到輸入月份的前一個月之陣列資料
			for (int i = 0; i < this.NumOfDaysInEachMonth.length - 1; i++) {
				tempCountOfDays += this.NumOfDaysInEachMonth[i];
			}
			tempCountOfDays += this.DAY;
		}

		this.CountOfDays = tempCountOfDays;

	}

	public int getWhatDayOfTheYearIsThisDate() {
		return this.CountOfDays;
	}

	// 印出輸入的日期為當天第幾天
	public void printWhatDayOfTheYearIsThisDate() {
		System.out.println("輸入的日期為該年第 " + this.CountOfDays+" 天");
		System.out.println("-----------------------------------");
	}
}
