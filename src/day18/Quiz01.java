package day18;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws Exception {
		File path = new File("E:/오후취업반/abcd1234/test.txt");
		FileOutputStream os = new FileOutputStream(path);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = input.next();
		System.out.print("Age: ");
		String age = input.next();
		System.out.print("Address: ");
		String addr = input.next();
		
		os.write(name.getBytes());
		os.write(age.getBytes());
		os.write(addr.getBytes());
	}
}
