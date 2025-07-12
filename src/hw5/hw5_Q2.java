package hw5;

//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：

public class hw5_Q2 {

	private static final int TAKE_NUM = 10;
	private static final int NUM_RANGE = 100;

	public static void main(String[] args) {

		RandAvg randAbg = new RandAvg(TAKE_NUM, NUM_RANGE);
		randAbg.display();

	}

}

class RandAvg implements Display {

	private int[] saveRandomNum;
	private int saveRandomNumAvg;

	public RandAvg(int TAKE_NUM, int NUM_RANGE) {
		System.out.println("隨機顯示 " + TAKE_NUM + " 個 " + "0~" + NUM_RANGE + "(含" + NUM_RANGE + ")範圍的整數，並算出平均值。");
		setSaveRandomNumAndAvg(TAKE_NUM, NUM_RANGE);
	}

	public void setSaveRandomNumAndAvg(int TAKE_NUM, int NUM_RANGE) {
		int[] tempSaveRandomNum = new int[TAKE_NUM];
		int tempSaveRandomNumAvg = 0;

		for (int i = 0; i < tempSaveRandomNum.length; i++) {
			tempSaveRandomNum[i] = (int) (Math.random() * (NUM_RANGE + 1));
			tempSaveRandomNumAvg += tempSaveRandomNum[i];
		}

		saveRandomNum = tempSaveRandomNum;

		saveRandomNumAvg = tempSaveRandomNumAvg / tempSaveRandomNum.length;
	}

	public int[] getRandomNumSave() {
		return this.saveRandomNum;
	}

	public int getSaveRandomNumAvg() {
		return this.saveRandomNumAvg;
	}

	public void display() {
		for (int i = 0; i < getRandomNumSave().length; i++) {
			System.out.print(getRandomNumSave()[i] + ", ");
		}
		System.out.println();
		System.out.println("平均值是：" + getSaveRandomNumAvg());
	}
}
