package day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * ���� �����
 * - ��ũ�� �����ϴ� ���
 * - ���� ������ �ϱ� ���� ���
 */
public class Ex01 {
	public static void main(String[] args) throws Exception {
		File path = new File("E:/���������/aaa.txt"); // "" �ȿ��� ���� ��� �ۼ�
		//stream: ���� ���
		FileOutputStream os = new FileOutputStream(path);
		os.write('A');
		os.write(97);
		
		String s = "hello";
		os.write(s.getBytes());
	}
}
