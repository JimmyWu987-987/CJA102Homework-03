package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/*
 * 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
代表的檔案會複製到第二個參數代表的檔案
*/

public class Hw7Q3 {

	public static final String FILE_SOURCE_PATH = "./src/hw7/source.png";
//	public static final String FILE_SOURCE_NAME = "source.txt";
	public static final String FILE_TARGET_PATH = "./src/hw7/target.png";
//	public static final String FILE_TARGET_NAME = "target.txt";

	public static void main(String[] args) {
		try {
			copyFile(FILE_SOURCE_PATH,FILE_TARGET_PATH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void copyFile(String FILE_SOURCE_PATH,String FILE_TARGET_PATH) throws IOException {

		File sourceFile = new File(FILE_SOURCE_PATH);
		File targetFile = new File(FILE_TARGET_PATH);
		

//		if (!sourceFile.exists()) {
//			boolean testCheck = sourceFile.createNewFile();
//			if (testCheck) {
//				System.err.println("檔案 " + FILE_SOURCE_NAME + " 已創建。");
//			} else {
//				System.err.println("檔案 " + FILE_SOURCE_NAME + " 創建失敗。");
//			}
//		} else {
//			System.err.println("檔案已存在");
//		}
		System.err.println("檔案傳送中...");

		FileInputStream fis = new FileInputStream(sourceFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int lenght;
		byte[] b = new byte[1024];
		while ((lenght = bis.read(b)) != -1) {
			bos.write(b,0,lenght);
			bos.flush();
		}
		
		bos.close();
		bis.close();
		fos.close();
		fis.close();
		System.err.println("檔案傳送成功...");

	}
}
