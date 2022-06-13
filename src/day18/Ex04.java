package day18;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		File path = new File("E:/오후취업반/aaa.txt");
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos); //보조스트림
		
		for(int i='1';i<'9';i++) {
			//Thread.sleep(2000);
			bos.write(i); //데이터를 축적하는중
		}
		bos.flush(); //데이터를 비워줌 -> 내보냄
	}
}
