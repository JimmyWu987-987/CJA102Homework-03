package hw4;

import java.util.Arrays;

/*
 * 『此類別給 hw4_Q1.java 使用』 
 * 
 * 有個一維陣列如下：
 * {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
 * (提示：陣列，length屬性)
 *
*/

public class hw4_Q1_Methed {

	private int ArraysAvgNumber;
	private int[] ArraysResults;
	
	public hw4_Q1_Methed(int[] ArraysResults) {
		int tempAvgNumber = 0;

		for (int i = 0; i < ArraysResults.length; i++) {
			tempAvgNumber += ArraysResults[i];
		}

		this.ArraysAvgNumber = tempAvgNumber / ArraysResults.length;
		
		Arrays.sort(ArraysResults);
		int ArraysDateCount = 0;

		while (ArraysDateCount < ArraysResults.length) {
			if (ArraysResults[ArraysDateCount] > ArraysAvgNumber) {

				this.ArraysResults = Arrays.copyOfRange(ArraysResults, ArraysDateCount, ArraysResults.length);
				break;
			}
			ArraysDateCount++;
		}
	}
	
	/*
	 * setArraysIsAvg 方法：計算該陣列元素之平均值
	 * 
	 * @param 需要算出平均值之陣列
	 * 
	 * @return 該陣列之平均值
	 */
	public void setArraysIsAvg(int[] ArraysDate) {
		int tempAvgNumber = 0;

		for (int i = 0; i < ArraysDate.length; i++) {
			tempAvgNumber += ArraysDate[i];
		}

		this.ArraysAvgNumber = tempAvgNumber / ArraysDate.length;
		
		
		
	}

	/*
	 * getArraysAvgNumber 方法：回傳 setArraysIsAvg() 的值
	 */
	public int getArraysIsAvg() {
		return ArraysAvgNumber;
	}

	/*
	 * setArraysElementGreaterAvg 方法：計算該陣列大於平均值之元素，並存另一個陣列
	 */

	public void setArraysElementGreaterAvg(int[] ArraysDate, int getArraysIsAvg) {

		Arrays.sort(ArraysDate);
		int ArraysDateCount = 0;

		while (ArraysDateCount < ArraysDate.length) {
			if (ArraysDate[ArraysDateCount] > getArraysIsAvg) {

				ArraysResults = Arrays.copyOfRange(ArraysDate, ArraysDateCount, ArraysDate.length);
				break;
			}
			ArraysDateCount++;
		}
	}

	/*
	 * setArraysElementGreaterAvg 方法：回傳 setArraysElementGreaterAvg 的值
	 * 
	 */
	public int[] getArraysElementGreaterAvg() {
		return ArraysResults;
	}

	public void printArraysAvgAndArraysResults() {

		System.out.println("該陣列平均值：" + ArraysAvgNumber);
		System.out.println("該陣列之元素（由小至大）：");

		for (int i = 0; i < ArraysResults.length; i++) {
			System.out.print(ArraysResults[i] + "\t");
		}

	}

}
