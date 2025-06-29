package hw3;

import java.util.Scanner;

public class ScannerObject {

	int i;
	Scanner sc = new Scanner(System.in);

	/*
	 * 利用無窮迴圈持續判斷鍵盤是否有輸入為整數，有輸入非整數會清除重來
	 */
	public int KeyIn() {		
		do {
			if (sc.hasNextInt()) {
				i = sc.nextInt();
//				sc.nextLine();
				break;
			} else {
				System.out.println("輸入錯誤，請輸入整數。");
//				sc.nextLine(); // 清除nextInt()的資料並且清除可能的換行符號
				
			}
		} while (true);

		return i;
	}

}
