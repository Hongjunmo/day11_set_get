package day11_set_get;

import java.util.Scanner;

public class Ex04_Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Ex04_set_get ex = new Ex04_set_get();
		String name;
		int age;
		System.out.println("이름 입력");
		name = scan.next();
		System.out.println("나이 입력");
		age = scan.nextInt();
		ex.setAge(age);
		ex.setName(name);
		
		System.out.println(ex.getName()+"님의 나이는"+ex.getAge()+"살 입니다.");
		
		
	
	
	
	
	
	
	}
}
