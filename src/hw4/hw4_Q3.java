package hw4;

/*
 * 有個字串陣列如下 (八大行星)：
 * {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
 * 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
 * (提示：字元比對，String方法)
*/
public class hw4_Q3 {

	
	private static final String[] EIGHT_PLANETS = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
	
	public static void main(String[] args) {
		
		hw4_Q3_method hw4_Q3 = new hw4_Q3_method(EIGHT_PLANETS);
		hw4_Q3_method Apple = new hw4_Q3_method("Apple");
		
//		System.out.println(Apple.getNumberOfVowelsCount());
//		hw4_Q3.setStrArrIsNumberOfVowels(EIGHT_PLANETS);
//		hw4_Q3.printNumberOfVowelsCount();
		
	}

}
