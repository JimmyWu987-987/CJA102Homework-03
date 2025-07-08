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

public class hw4_Q5_method {

	private int YEAR;
	private int MONTH;
	private int DAY;
	private boolean leapYear; // 判斷閏年的真假
	private int[] DayOfTheMonth = new int[12]; // 依大小月不同，存入對應值，例如：1月是DayOfTheMonth[0] = 31

	ScannerObject sc = new ScannerObject();

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

	// 印出輸入日期的方法
	public void printDate() {
		System.out.print("您輸入的日期為西元 " + this.YEAR + " 年 " + this.MONTH + " 月 " + this.DAY + " 日。");

		if (this.leapYear)
			System.out.println("此年為閏年。");
		else
			System.out.println("此年為平年。");
	}


	// 用陣列儲存資料，[月份+1]為陣列長度
	// 運用switch判斷大小月以及２月的天數
	public void setDayOfTheMonthArrays() {

		for (int i = 0; i < DayOfTheMonth.length; i++) {
			switch (i) {
			case 1: // 2月判斷閏月
				if (this.leapYear) {
					this.DayOfTheMonth[i] = 29;
					break;
				} else {
					this.DayOfTheMonth[i] = 28;
					break;
				}
			case 0:
			case 2:
			case 4:
			case 6:
			case 7:
			case 9:
			case 11:
				this.DayOfTheMonth[i] = 31; // 大月的話帶入31
				break;
			default:
				this.DayOfTheMonth[i] = 30; // 其餘小月帶入30
				break;
			}
		}
	}
	// 計算輸入的日期為當天第幾天的方法

}
