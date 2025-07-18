package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * 請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
*/

public class Hw7Q1 {

	public static final String FILE_PATH = "/Users/workjimmy/CJA102_workspace/Java_WorkSpace/Homework-03/src/hw7/Sample.txt";

	public static void main(String[] args) {
		File sampleTxt = new File(FILE_PATH);

		int countChar = 0;
		int countStr = 0;

		try {

			countChar = fileBuffReaderCountChar(FILE_PATH);
			countStr = fileBuffReaderCountStr(FILE_PATH);

		} catch (IOException e) {

		}
		System.out.println(
				" Sample.txt檔案共有 " + sampleTxt.length() + " 個位元組, " + countChar + " 個字元， " + countStr + " 列資料");

	}

	public static int fileBuffReaderCountChar(String FILE_PATH) throws IOException {
		FileReader fr1 = new FileReader(FILE_PATH);
		BufferedReader br1 = new BufferedReader(fr1);
		int fileDataInt;
		int countChar = 0;
		while ((fileDataInt = br1.read()) != -1) {
			countChar++;
		}
		br1.close();
		fr1.close();
		return countChar;
	}

	public static int fileBuffReaderCountStr(String FILE_PATH) throws IOException {
		FileReader fr2 = new FileReader(FILE_PATH);
		BufferedReader br2 = new BufferedReader(fr2);

		String fileDataStr;
		int countStr = 0;
		while ((fileDataStr = br2.readLine()) != null) {
//			System.out.println(fileDataStr);
			System.out.flush();
			countStr++;
		}
		br2.close();
		fr2.close();

		return countStr;
	}

}
