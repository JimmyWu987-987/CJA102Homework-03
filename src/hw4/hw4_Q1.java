package hw4;

/*
 * 有個一維陣列如下：
 * {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
 * (提示：陣列，length屬性)
*/

public class hw4_Q1 {

	public final static int[] ARRAYS_DATE = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

	public static void main(String[] args) {
		hw4_Q1_Method hw4_Q1 = new hw4_Q1_Method(ARRAYS_DATE);

//		hw4_Q1.setArraysIsAvg(ARRAYS_DATE);
//		hw4_Q1.setArraysElementGreaterAvg(ARRAYS_DATE, hw4_Q1.getArraysIsAvg());
		hw4_Q1.printArraysAvgAndArraysResults();

	}
}
