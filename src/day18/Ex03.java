package day18;

import java.io.File;
import java.io.FileInputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		File path = new File("E:/오후취업반/aaa.txt");
		FileInputStream fis = new FileInputStream(path);
		
		while(true) {
			Thread.sleep(1000);
			int res = fis.read();
			//System.out.println(res);
			if(res<0) //공백은 -1로 처리되기 때문에 문자열이 끝나면 멈춤
				break;
			System.out.println((char)res);
		}
	}

}
