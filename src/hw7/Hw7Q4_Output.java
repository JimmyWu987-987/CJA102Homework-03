package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾

承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
型簡化本題的程式設計)

 * */

public class Hw7Q4_Output {

	public static final String DIR_PATH = "./src/hw7/data";
	public static final String FILE_NAME = "Object.ser";

	public static void main(String[] arge) {

		File dir = new File(DIR_PATH);
		File file = new File(DIR_PATH, FILE_NAME);

		if (dir.isDirectory()) {
			System.out.println("Have a directory.");
		} else {
			System.out.println("Not a directory and make a directory.");
			dir.mkdir();
		}
		Speak[] speak = new Speak[4];
		
		speak[0] = new Dog("dog1");
		speak[1] = new Dog("dog2");
		speak[2] = new Cat("cat1");
		speak[3] = new Cat("cat2");

		// 輸出
		try {
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			for (int i = 0; i < speak.length; i++) {
				oos.writeObject(speak[i]);
			}
		

			oos.flush();
			
			oos.close();
			bos.close();
			fos.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("物件已經成功檔案化");

	}

}
