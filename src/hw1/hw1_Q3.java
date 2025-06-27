package hw1;
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class hw1_Q3 {
	public static void main(String[] args) {
		final int total = 256559;	//輸入任意整數就能計算（單位：秒）
		int sec, min, hrs, days;
		
		days = total;
		
//		sec = total%60;		//59秒
//		total = total/60;	//總共2475分
//		
//		min = total%60;		//15分
//		total = total/60;	//總共71時
//		
//		hrs = total%24;		//23時
//		days = total/24;	//2天
		
		sec = days%60;		//59秒
		days = days/60;		//總共2475分
		
		min = days%60;		//15分
		days = days/60;		//總共71時
		
		hrs = days%24;		//23時
		days = days/24;		//2天
		
		
//		System.out.println(total);
		System.out.println(total + " 秒為");
		System.out.println( days + " 天 " + hrs + " 時 " + min + " 分 "+ sec + " 秒");
	}
}
