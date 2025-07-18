package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/*
 * 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
append功能讓每次執行結果都能被保存起來)
 * 
 * */

public class Hw7Q2 {

	public static final String FILE_PATH = "./src/hw7/Data.txt";

	public static void main(String[] args) {
		File datatxt = new File(FILE_PATH);
		FileOutputStream fos;
		List arrlist = new ArrayList();
		int count = 0;

		try {
			fos = new FileOutputStream(datatxt, true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);

			while (arrlist.size() < 10) {
				arrlist.add((int) (Math.random() * 1000 + 1));
				ps.println((int) arrlist.get(count) + ",第 " + (count + 1) + " 次 append 覆寫");

				count++;

			}
			ps.println();
			ps.close();
			bos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
