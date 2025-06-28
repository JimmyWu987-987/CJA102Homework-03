package hw3;

import java.util.Scanner;

public class ScannerObject {

	int i;

	Scanner sc = new Scanner(System.in);

	public int KeyIn() {
		if (sc.hasNextInt()) {
			i = sc.nextInt();
		} else {
			System.out.println("輸入錯誤，請輸入整數。");
		}
			

		return i;
	}

}
