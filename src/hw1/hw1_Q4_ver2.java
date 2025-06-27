package hw1;

//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
public class hw1_Q4_ver2 {

	// pi:圓周率
	// r:圓半徑

	public static float CircleArea(float r) {// 計算圓面積
		final float pi = 3.1415f;
		return pi * r * r;
	}

	public static float Circumference(float r) {// 計算圓周率
		final float pi = 3.1415f;
		return pi * 2 * r;

	}

	public static void main(String[] args) {

		System.out.println("半徑為5的圓");
		System.out.println("圓面積為 " + CircleArea(5));
		System.out.println("圓周長為 " + Circumference(5));

	}
}
//為什麼使用Double宣告答案會是？
//半徑為5的圓
//圓面積為 78.53750000000001
//圓周長為 31.415000000000003
