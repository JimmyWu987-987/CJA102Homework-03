package hw4;

import java.util.Arrays; // 引入 Arrays 類別，方便複製一維陣列

public class DeepCopyTwoDimArray {

	/**
	 * 深層複製一個二維整數陣列。 確保回傳的新陣列與原始陣列完全獨立，修改新陣列不會影響原始陣列。
	 *
	 * @param originalMatrix 欲複製的原始二維整數陣列。
	 * @return 一個與 originalMatrix 內容相同但獨立的新二維整數陣列。
	 */
	public static int[][] deepCopy(int[][] originalMatrix) {
		if (originalMatrix == null) {
			return null; // 如果原始陣列為 null，直接回傳 null
		}

		// 1. 創建一個新的二維陣列，其「列數」與原始陣列相同。
		// 此時 newMatrix 的每個元素（即每一列）都是 null。
		int[][] newMatrix = new int[originalMatrix.length][];

		// 2. 遍歷原始陣列的每一列。
		for (int i = 0; i < originalMatrix.length; i++) {
			// 檢查原始陣列中的這一列是否為 null，以防止 NullPointerException。
			if (originalMatrix[i] != null) {
				// 3. 對於每一列，進行「淺層複製」來創建一個新的獨立一維陣列。
				// Arrays.copyOf() 會創建一個新的 int[] 陣列，並將 originalMatrix[i] 的內容複製進去。
				newMatrix[i] = Arrays.copyOf(originalMatrix[i], originalMatrix[i].length);
			} else {
				// 如果原始陣列中的某一列是 null，則新陣列對應的列也設為 null。
				newMatrix[i] = null;
			}
		}
		return newMatrix; // 回傳深層複製後的新二維陣列
	}
}