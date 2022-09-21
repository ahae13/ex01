package basic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("D:/temp/test.txt");
		if(!file.exists() || !file.isDirectory()) {
			System.out.println("없는 디렉토리입니다.");
		}
		
		File[] files = file.listFiles();
		for(int i = 0; i < files.length; i++) {
			System.out.println("파일이름 = " + files[i].getName());
		}
		try {
			
			FileWriter fw = new FileWriter("test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
