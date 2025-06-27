package hw1;
//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
public class hw1_Q4 {
	public static void main(String[] args) {
		final float pi = 3.1415f;
		float r = 5;//, CL, CA;	//半徑r; 圓周長CL ;圓面積CA 
		
//		CA = pi*(r*r);
//		CL = pi*2*r;
		
		System.out.println("半徑為5的圓");
		System.out.println("圓面積為 " + (pi*(r*r)));
		System.out.println("圓周長為 " + (pi*2*r));
		
	}
}
//為什麼使用Double宣告答案會是？
//半徑為5的圓
//圓面積為 78.53750000000001
//圓周長為 31.415000000000003
