package hw1;

//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//金加利息共有多少錢 (用複利計算，公式請自行google)
public class hw1_Q5_ver2 {
//	FV:複利後金額 
//	PV:本金
//	x:年利率
//	year:要存的年數
	public static double FV(double PV, double x, int year) {

		double sum = 0;

		System.out.println("本金：" + PV + "；年利率：" + x);
		for (int i = 1; i <= year; i++) {
			sum = PV * (1 + x);
			System.out.println("第 " + i + " 年的本金加複利為 " + sum + " 元。");
			PV = sum;
		}
		return sum;
	}

	public static void main(String[] args) {

		FV(1_500_000, 0.02, 10);

	}
}
