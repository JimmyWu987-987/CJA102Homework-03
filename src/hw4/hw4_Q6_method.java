package hw4;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * 此方法是給『hw4_Q6.java』是用
 * 班上有8位同學，他們進行了6次考試結果如下：
 * 
 * +-----+-----+-----+-----+-----+-----+-----+-----+-----+
 * |     | 1號 | 2號 | 3號  | 4號 | 5號 | 6號  | 7號 | 8號 |
 * +-----+-----+-----+-----+-----+-----+-----+-----+-----+
 * | 1考 | 10  | 35  | 40  | 100 | 90  | 85  | 75  | 70  |
 * +-----+-----+-----+-----+-----+-----+-----+-----+-----+
 * | 2考 | 37  | 75  | 77  | 89  | 64  | 75  | 70  | 95  |
 * +-----+-----+-----+-----+-----+-----+-----+-----+-----+
 * | 3考 | 100 | 70  | 79  | 90  | 75  | 70  | 79  | 90  |
 * +-----+-----+-----+-----+-----+-----+-----+-----+-----+
 * | 4考 | 77  | 95  | 70  | 89  | 60  | 75  | 85  | 89  |
 * +-----+-----+-----+-----+-----+-----+-----+-----+-----+
 * | 5考 | 98  | 70  | 89  | 90  | 75  | 90  | 89  | 90  |
 * +-----+-----+-----+-----+-----+-----+-----+-----+-----+
 * | 6考 | 90  | 80  | 100 | 75  | 50  | 20  | 99  | 75  |
 * +-----+-----+-----+-----+-----+-----+-----+-----+-----+
 * 
 * (提示：二維陣列)
 * 請算出每位同學考最高分的次數
 * 
*/

// 計算某同學在是某次考試考最高分，為最高分則計算一次 的物件
public class hw4_Q6_method {

	private int[] highestScoresArrays; // 存放所有考試中，每次最高分的分數
	private int[] numOfHighestScoresIsStudentCount; // 存放所有同學每次考試考最高分的次數
	private int numOfStudents; // 存放參加考試的同學人數

	public hw4_Q6_method (int[][] STUDENT_SCORES) {
		setSelecthighestScoresStudet(STUDENT_SCORES);
		printNumOfStudents();
	}
	// 利用某次的考試最高分，尋找誰是考此分數的同學 的方法
	public void setSelecthighestScoresStudet(int[][] STUDENT_SCORES) {
		
		// 找出所有考試中最高分的分數
		// 儲存至 HighestScoresArrays()
		setHighestScoresArrays(STUDENT_SCORES);
		
		// 掃描有幾位同學參加考試
		setHowManyStudentsAreThere(STUDENT_SCORES);
		
		int[] tempHighestScoresArrays = this.highestScoresArrays;
		int[] tempNumOfHighestScoresIsStudentCount = new int[this.numOfStudents];
		
		// 將考最高分的同學，做累加，將累加結果存放至 NumOfHighestScores[] 的方法
		// 加入有同分同學的判斷
		for (int i = 0; i < STUDENT_SCORES.length; i++) {
			for (int j = 0; j < STUDENT_SCORES[i].length; j++) {
				if (tempHighestScoresArrays[i] == STUDENT_SCORES[i][j]) {
					tempNumOfHighestScoresIsStudentCount[j]++;
				}
			}
		}
		this.numOfHighestScoresIsStudentCount = tempNumOfHighestScoresIsStudentCount;
	}
	public int[] getSelecthighestScoresStudet() {
		return this.numOfHighestScoresIsStudentCount;
	}
	
	// 掃描某一次考試，做陣列排序，找出某次考試的最高分，索引值為 7 必定為最高分 的方法
	// 此方法給 setSelecthighestScoresStudet() 使用
	private void setHighestScoresArrays(int[][] STUDENT_SCORES) {

		int[][] tempSTUDENT_SCORES = DeepCopyTwoDimArray.deepCopy(STUDENT_SCORES);
		int[] tempNumOfHighestScores = new int[STUDENT_SCORES.length];

		// STUDENT_SCORES.length 計算列的長度
		// 掃描考試次數
		// STUDENT_SCORES[i].length 計算欄的長度
		// 掃描最後一個索引值，此索引的值，必為最高分
		for (int i = 0; i < tempSTUDENT_SCORES.length; i++) {
			Arrays.sort(tempSTUDENT_SCORES[i]);
			tempNumOfHighestScores[i] = Array.getInt(tempSTUDENT_SCORES[i], tempSTUDENT_SCORES[i].length - 1);
		}
		highestScoresArrays = tempNumOfHighestScores;
	}
	public int[] getHighestScoresArrays() {
		return this.highestScoresArrays;
	}

	// 計算參加考試的人數
	// 掃描有幾位同學參加考試 的方法
	// 此方法給 setSelecthighestScoresStudet() 使用
	private void setHowManyStudentsAreThere(int[][] STUDENT_SCORES) {
		int tempNumOfStudents = 0;

		tempNumOfStudents = STUDENT_SCORES[0].length;
		this.numOfStudents = tempNumOfStudents;
	}
	public int getHowManyStudentsAreThere() {
		return this.numOfStudents;
	}

	// 印出在所有考試中，所有同學考最高分的次數的 方法
	public void printNumOfStudents() {
		int[] tempNumOfHighestScoresIsStudentCount = this.numOfHighestScoresIsStudentCount;

		System.out.println("請算出每位同學考最高分的次數");
		for (int i = 0; i < tempNumOfHighestScoresIsStudentCount.length; i++) {
			System.out.println( (i+1) + " 號有 " + tempNumOfHighestScoresIsStudentCount[i] + " 次");
		}
	}
}
