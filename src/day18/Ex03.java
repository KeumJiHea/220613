package day18;

import java.io.File;
import java.io.FileInputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		File path = new File("E:/���������/aaa.txt");
		FileInputStream fis = new FileInputStream(path);
		
		while(true) {
			Thread.sleep(1000);
			int res = fis.read();
			//System.out.println(res);
			if(res<0) //������ -1�� ó���Ǳ� ������ ���ڿ��� ������ ����
				break;
			System.out.println((char)res);
		}
	}

}
