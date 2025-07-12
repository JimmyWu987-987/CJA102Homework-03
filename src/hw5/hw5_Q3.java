package hw5;

import java.util.Arrays;

//利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//可以找出二維陣列的最大值並回傳，如圖：

public class hw5_Q3 {
	private static final int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
	private static final double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

	public static void main(String[] args) {
		MaxElement ex = new MaxElement();
		ex.maxElement(intArray);
		ex.maxElement(doubleArray);
		ex.display();
	}
}

class MaxElement implements Display {

	private int intMaxElement;
	private double doubleMaxElement;

	public MaxElement() {

	}

	public int maxElement(int[][] intArray) {

		int[] tempMaxNum = new int[2];

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				Arrays.sort(intArray[i]);
				tempMaxNum[i] = intArray[i][intArray[i].length - 1];
			}
		}
		Arrays.sort(tempMaxNum);
		this.intMaxElement = tempMaxNum[tempMaxNum.length - 1];

		return this.intMaxElement;
	}

	public double maxElement(double[][] doubleArray) {
		
		double[] tempMaxNum = new double[2];

		for (int i = 0; i < doubleArray.length; i++) {
			for (int j = 0; j < doubleArray[i].length; j++) {
				Arrays.sort(doubleArray[i]);
				tempMaxNum[i] = doubleArray[i][doubleArray[i].length - 1];
			}
		}
		Arrays.sort(tempMaxNum);
		this.doubleMaxElement = tempMaxNum[tempMaxNum.length - 1];

		return this.doubleMaxElement;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("intArray陣列的最大值："+ this.intMaxElement);
		System.out.println("doubleArray陣列的最大值："+ this.doubleMaxElement);
	}

}