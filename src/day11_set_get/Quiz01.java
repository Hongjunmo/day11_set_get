package day11_set_get;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Quiz01_class lo = new Quiz01_class();
		Scanner scan = new Scanner(System.in);
		String id=null, pw=null;
		int choice;

		while (true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.로그아웃");
			System.out.print(">>>");
			choice = scan.nextInt();
			switch (choice) {
			case 1: 
				System.out.print("아이디 입력 :");
				id=scan.next();
				System.out.print("비밀번호 입력 :");
				pw=scan.next();
				lo.login(id, pw);
				break;
			case 2:
				System.out.print("가입 id : ");
				id = scan.next();
				System.out.print("가입 pw : ");
				pw = scan.next();
				lo.signUp(id, pw);
				break;
				
			case 3:
				System.out.println("로그아웃 완료");
				System.exit(0);

			}

		}
	}
}
