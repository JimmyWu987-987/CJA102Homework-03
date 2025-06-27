package hw1;

//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//金加利息共有多少錢 (用複利計算，公式請自行google)
public class hw1_Q5 {

	public static void main(String[] args) {
		double FV, PV = 1_500_000; // FV:複利後金額; PV:本金;
		double interest, x = 0.02; // x:年利率 interest:利息

		System.out.println("本金：" + PV + "；年利率：" + x);
		for (int i = 1; i <= 10; i++) {
			FV = PV * (1 + x);
			interest = FV - PV;
			System.out.println("第 " + i + " 年的本金加複利為 " + FV + " 元，今年的利息為 " + interest + "元。");
			PV = FV;
		}
	}
}
