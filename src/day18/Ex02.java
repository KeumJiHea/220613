package day18;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String id = "abcd";
		String pwd= "333";
		
		while(true) {
			System.out.print("ID: ");
			id = input.next();
			
			File path = new File("E:/���������/" + id + ".txt");		
			if(path.exists()) {//�ش� ������ ������ ��
				System.out.println("�����ϴ� ���̵��Դϴ�.");
			}else {//�ش� ������ ���� ��
				System.out.print("Password: ");
				pwd = input.next();
				FileOutputStream fos = new FileOutputStream(path);
				fos.write(id.getBytes());
				fos.write(pwd.getBytes());
				System.out.println("��ϵǾ����ϴ�.");
				break;
			}
		}


	}
}
