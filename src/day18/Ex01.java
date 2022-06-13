package day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 파일 입출력
 * - 디스크에 저장하는 방식
 * - 영구 저장을 하기 위해 사용
 */
public class Ex01 {
	public static void main(String[] args) throws Exception {
		File path = new File("E:/오후취업반/aaa.txt"); // "" 안에는 파일 경로 작성
		//stream: 연결 통로
		FileOutputStream os = new FileOutputStream(path);
		os.write('A');
		os.write(97);
		
		String s = "hello";
		os.write(s.getBytes());
	}
}
