package hw7;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Hw7Q4_Input {
	public static final String DIR_PATH = "./src/hw7/data";
	public static final String FILE_NAME = "Object.ser";

	public static void main(String[] args) throws Exception {
		File file = new File(DIR_PATH, FILE_NAME);

		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);

		System.out.println(file.getName() + "檔案內容如下：");
		System.out.println("--------------------------------");

		try {
			while (true) {
				((Speak) ois.readObject()).speak();

			}
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.out.println("資料讀取完畢！");
//			e.printStackTrace();
		}
		ois.close();
		bis.close();
		fis.close();
		
		System.out.println("資料流關閉，程式結束！");
	}

}
