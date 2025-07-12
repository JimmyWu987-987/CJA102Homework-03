package hw5;

//請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//圖：

import hw3.ScannerObject;

public class hw5_Q1 {

	public static void main(String[] args) {
		starSquare ss = new starSquare();
	}

}

class starSquare implements Display {
	private int width;
	private int height;
	ScannerObject sc = new ScannerObject();

	public starSquare() {
		System.out.println("請輸入寬與高：");
		setWidth();
		setHeight();
		getStarSquare(getWidth(), getHeight());

	}

	public void getStarSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				display();
			}
			System.out.println();
		}
	}

	public void setWidth() {
		this.width = sc.setKeyIn();
	}

	public int getWidth() {
		return this.width;
	}

	public void setHeight() {
		this.height = sc.setKeyIn();
	}

	public int getHeight() {
		return this.height;
	}

	public void display() {
		System.out.print("*");
	}
}