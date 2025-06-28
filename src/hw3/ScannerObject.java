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
			}
		}while(true);
		
			
		return i;
	}

}
