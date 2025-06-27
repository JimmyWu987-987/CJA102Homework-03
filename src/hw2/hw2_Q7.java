package hw2;

//請設計一隻Java程式，輸出結果為以下：
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class hw2_Q7 {
	public static void main(String[] args) {
		int i, j;

		for (i = 0; i < 6; i++) {
			for (j = 0; j < i + 1; j++) {
				System.out.print((char) (i + 65)); // 'A'＝65，依照uicode累加後，轉換型態成字元輸出。
			}
			System.out.println();
		}
	}

}
