package day18;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		File path = new File("E:/���������/aaa.txt");
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos); //������Ʈ��
		
		for(int i='1';i<'9';i++) {
			//Thread.sleep(2000);
			bos.write(i); //�����͸� �����ϴ���
		}
		bos.flush(); //�����͸� ����� -> ������
	}
}
