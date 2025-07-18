package hw6;

import java.util.Scanner;

/*
 * 請設計三個類別Calculator.java，CalException.java與CalTest.java，在Calculator.java裡有個自訂
方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。 CalTest.java執行後，使用者可
以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
1. x與y同時為0，(產生自訂的CalException例外物件)
2. y為負值，而導致x的y次方結果不為整數
3. x與y皆正確情況下，會顯示運算後結果

*/

public class Calculator {

	private int powerResult;
	private int x;
	private int y;
	private static final Scanner sc = new Scanner(System.in);
	private CalException checkerException = new CalException();

	public Calculator() {
		this.x = 0;
		this.y = 0;
		this.powerResult = 0;
	}

	public void getInputsAndValidate() {

		boolean checkOut = false;
		do {

			try {
				setX();
				setY();
				checkOut = checkerException.checkException(getX(), getY());

			} catch (CalException e) {
//				e.printStackTrace();
				System.err.println(e.getMessage());
			}
		} while (!checkOut);
	}

	public void setX() throws CalException {
		int tempX;
		System.out.println("請輸入Ｘ值：");

		if (sc.hasNextInt()) {
			tempX = this.sc.nextInt();
			sc.nextLine();
			this.x = tempX;
		} else {
			sc.nextLine();
			throw new CalException("輸入的值不能為文字或小數，請重新輸入。");
		}

	}

	public int getX() {
		return this.x;
	}

	public void setY() throws CalException {
		int tempY;
		System.out.println("請輸入Ｙ值：");
		if (sc.hasNextInt()) {
			tempY = this.sc.nextInt();
			sc.nextLine();
			this.y = tempY;
		} else {
			sc.nextLine();
			throw new CalException("輸入的值不能為文字或小數，請重新輸入。");
		}
	}

	public int getY() {
		return this.y;
	}

	public void setPower() {
		this.powerResult = (int) Math.pow(getX(), getY());
	}

	public int getPower() {
		return this.powerResult;
	}

	public void resultPrint() {
		System.out.println(this.getX() + " 的 " + this.getY() + " 次方等於 " + this.getPower());
	}

	public void closeScanner() {
		if (sc != null) {
			sc.close();
		}
	}
}
