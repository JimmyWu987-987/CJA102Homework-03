package hw3;

import java.util.Scanner;

public class ScannerObject {

	int i;

	Scanner sc = new Scanner(System.in);

	public int KeyIn() {
		do {
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				sc.nextLine();
				break;
			} else {
				System.out.println("輸入錯誤，請輸入整數。");
				sc.nextLine();
				// 清除nextInt()的資料並且清除可能的換行符號
			}
		} while (true);

		return i;
	}

}
