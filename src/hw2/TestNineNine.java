package hw2;

//請建立一個TestNineNine.java程式，可輸出九九乘法表
//• 一：使用for迴圈 + while迴圈
//• 二：使用for迴圈 + do while迴圈
//• 三：使用while迴圈 + do while迴圈

public class TestNineNine {
	public static void main(String[] args) {

		int i, j = 1;
		System.out.println("====ForWhile====");
		for (i = 1; i <= 9; i++) {
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
			j = 1;
		}

		System.out.println();
		System.out.println("====ForDoWhile====");

		for (i = 1; i <= 9; i++) {
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			j = 1;
			System.out.println();

		}
		System.out.println();
		System.out.println("====WhileDoWhile====");
		i = 1;

		while (i <= 9) {
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);

			System.out.println();
			i++;
			j = 1;
		}
	}
}
