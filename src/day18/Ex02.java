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
			
			File path = new File("E:/오후취업반/" + id + ".txt");		
			if(path.exists()) {//해당 파일이 존재할 때
				System.out.println("존재하는 아이디입니다.");
			}else {//해당 파일이 없을 때
				System.out.print("Password: ");
				pwd = input.next();
				FileOutputStream fos = new FileOutputStream(path);
				fos.write(id.getBytes());
				fos.write(pwd.getBytes());
				System.out.println("등록되었습니다.");
				break;
			}
		}


	}
}
