package hw3;

import java.util.Scanner;

public class ScannerObject {

	private int input;
	protected Scanner sc = new Scanner(System.in);

	/*
	 * 利用無窮迴圈持續判斷鍵盤是否有輸入為整數，有輸入非整數會清除重來
	 * 只能輸入正整數
	 */
	public int setKeyIn() {
		
		do {
			if (sc.hasNextInt()) {
				input = sc.nextInt();
				if (input <= 0) {
					System.out.println("只能是正整數，請重新輸入。");
					sc.nextLine();
					continue;
				} else {
					break;
				}

			} else {
				System.out.println("輸入錯誤，請輸入整數。");
				sc.nextLine();

				continue;
			}
		} while (true);

		return input;
	}

	/*
	 * 利用無窮迴圈持續判斷鍵盤是否有輸入為整數，有輸入非整數會清除重來 
	 * 只能輸入1~9的個位數
	 */
	public int setkeyInUnitsDigit19() {

		do {
			if (sc.hasNextInt()) {
				input = sc.nextInt();
				if ((input > 9) || (input <= 0)) {
					System.out.println("只能輸入個位數字1~9，請重新輸入。");
					continue;
				} else {
					break;
				}

			} else {
				System.out.println("輸入錯誤，請輸入整數。");
				sc.nextLine();
				continue;
			}
		} while (true);
		
		return input;
	}
	
	/*
	 * 利用無窮迴圈持續判斷鍵盤是否有輸入為整數，有輸入非整數會清除重來 
	 * 只能輸入0~9的個位數
	 */
	
	public int setkeyInUnitsDigit09() {

		do {
			if (sc.hasNextInt()) {
				input = sc.nextInt();
				if ((input > 9) || (input < 0)) {
					System.out.println("只能輸入個位數字0~9，請重新輸入。");
					continue;
				} else {
					break;
				}

			} else {
				System.out.println("輸入錯誤，請輸入整數。");
				sc.nextLine();

				continue;
			}
		} while (true);
		
		return input;
	}

}
