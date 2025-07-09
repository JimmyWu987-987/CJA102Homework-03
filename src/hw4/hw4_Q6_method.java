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

	private int[] HighestScoresArrays = new int[6]; // 陣列長度為６，存放這６次考試中，每次最高分的分數
	private int[] NumOfHighestScoresIsStudentArrays = new int[8]; // 陣列長度為８，存放這８位同學每次考試考最高分的次數

	// 掃描某一次考試，做陣列排序，找出某次考試的最高分，索引值為 7 必定為最高分 的方法
	// 此方法給 setSelecthighestScoresStudet() 使用
	private void setHighestScores(int[][] STUDENT_SCORES) {

		int tempNumOfHighestScores = 0;

		// STUDENT_SCORES.length 計算列的長度，長度為６
		// 掃描某考試，依照題目給的資料，總共有６次考試
		// STUDENT_SCORES[i].length 計算欄的長度，長度為８
		// 掃描
		for (int i = 0; i < STUDENT_SCORES.length; i++) {
			Arrays.sort(STUDENT_SCORES[i]);
			tempNumOfHighestScores = Array.getInt(STUDENT_SCORES[i], STUDENT_SCORES[i].length - 1);
			HighestScoresArrays[i] = tempNumOfHighestScores;
		}
	}

	public int[] getHigjestScores() {
		return this.HighestScoresArrays;
	}

	// 利用某次的考試最高分，尋找誰是考此分數的同學 的方法
	public void setSelecthighestScoresStudet(int[][] STUDENT_SCORES) {

		// 找出所有考試中最高分的分數
		// 儲存至 HigjestScoresArrays[]
		setHighestScores(STUDENT_SCORES);
		
		int[] tempHighestScoresArrays = getHigjestScores();
		int[] tempNumOfHighestScoresIsStudentArrays = new int[]

		// 將考最高分的同學，做累加，將累加結果存放至 NumOfHighestScores[] 的方法
		// 加入有同分同學的判斷
		for (int i = 0; i < STUDENT_SCORES.length; i++) {
			for (int j = 0; j < STUDENT_SCORES[i].length; j++) {
				if(tempHighestScoresArrays[i] == )
			}
		}

	}

	// 印出在這六次考試中，所有同學考最高分的次數的 方法
}
