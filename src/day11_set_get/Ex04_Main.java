package day11_set_get;

import java.util.Scanner;

public class Ex04_Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Ex04_set_get ex = new Ex04_set_get();
		String name;
		int age;
		System.out.println("�̸� �Է�");
		name = scan.next();
		System.out.println("���� �Է�");
		age = scan.nextInt();
		ex.setAge(age);
		ex.setName(name);
		
		System.out.println(ex.getName()+"���� ���̴�"+ex.getAge()+"�� �Դϴ�.");
		
		
	
	
	
	
	
	
	}
}
