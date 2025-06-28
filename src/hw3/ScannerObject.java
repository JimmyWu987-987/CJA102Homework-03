package hw3;

import java.util.Scanner;

public class ScannerObject {

		int i;
		double d;
		Scanner sc = new Scanner(System.in);
		
		public void KeyIn() {
			do {
				if (sc.hasNextInt()) {
					i = sc.nextInt();
					System.out.println(i);
				}
				if (sc.hasNextDouble()) {
					d = sc.nextDouble();
					System.out.println(d);
				}
			} while (i >= 0 && d >= 0);
		}

	}

