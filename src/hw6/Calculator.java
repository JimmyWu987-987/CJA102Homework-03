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

	private double powerResult;
	private double x;
	private double y;
	private Scanner sc = new Scanner(System.in);
	private CalException check = new CalException();

	public Calculator() {

		do {
			try {
				setX();
				setY();
			} catch (CalException e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}

		} while (getX() <= 0 || getY() <= 0);

		this.sc.close();
		setPower();
	}

	public void setX() throws CalException {
		double tempX;

		System.out.println("請輸入Ｘ值：");
		tempX = this.sc.nextInt();
		
		check.checkException(tempX);

		this.x = tempX;
		sc.nextLine();
	}

	public double getX() {
		return this.x;
	}

	public void setY() throws CalException{
		double tempY;

		System.out.println("請輸入Ｙ值：");
		tempY = this.sc.nextInt();

		check.checkException(tempY);
		
		this.y = tempY;
		sc.nextLine();
	}

	public double getY() {
		return this.y;
	}

	public void setPower() {
		this.powerResult = Math.pow(getX(), getY());
	}

	public double getPower() {
		return this.powerResult;
	}

	public void resultPrint() {

	}
}
