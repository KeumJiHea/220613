package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class AAA implements Serializable{
	String name;
	String addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
public class Ex06 {
public static void main(String[] args) throws Exception {
	Scanner input = new Scanner(System.in);
	String name, addr;
	
	System.out.println("1. ����");
	System.out.println("2. ��������");
	int num = input.nextInt();
	
	String path = "E:/���������/";
	
	AAA info = null;
	
	if(num==1) {
		System.out.print("�̸�: ");
		name = input.next();
		System.out.print("�ּ�: ");
		addr = input.next();
		info = new AAA();
		info.setName(name);
		info.setAddr(addr);
		File path02 = new File(path + name + ".txt");
		FileOutputStream fos = new FileOutputStream(path02);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(info);
		oos.close(); bos.close(); fos.close();
		System.out.println("����Ǿ����ϴ�.");
		
	}else {
		File list = new File(path);
		String[] li = list.list();
		for(String a : li) {
			System.out.println(a);
		}
		System.out.print("Ȯ���� �̸�: ");
		name = input.next();
		File p = new File(path + name + ".txt");
		p.delete();
		FileInputStream fis = new FileInputStream(p);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		info = (AAA)ois.readObject();
		System.out.println("�̸�: " + info.getName());
		System.out.println("�ּ�: " + info.getAddr());
	}
}
}
