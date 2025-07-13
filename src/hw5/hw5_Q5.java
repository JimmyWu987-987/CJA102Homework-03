package hw5;

/*身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
與數字的亂數組合，如圖：
*/
public class hw5_Q5 {
	
	// 宣告 int RAND_ARR_LENGTH 常數，可以由設計者決定要多長的空間。
	// 題目要求為８位數驗證碼
	private static final int RAND_ARR_LENGTH = 8;

	public static void main(String[] args) {
		GenAuthCode g1 =new GenAuthCode(RAND_ARR_LENGTH);
		g1.display();
		
	
	}

}
