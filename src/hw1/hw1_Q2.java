package hw1;
//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
public class hw1_Q2 {
	public static void main(String[] args) {
		int eggs = 200;	//輸入任意數量即可計算
		
		System.out.println("200顆雞蛋為 " + (eggs/12) + " 打又 " + (eggs%12) + " 顆。");
		
		
	}
}
