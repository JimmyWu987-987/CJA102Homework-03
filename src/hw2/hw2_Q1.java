package hw2;

//請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
public class hw2_Q1 {
	public static void main(String[] args) {
		int sum = 0, i = 1;

		while (i <= 1000) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("1~1000的偶數和為：" + sum);
	}
}
