package day11_set_get;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Quiz01_class lo = new Quiz01_class();
		Scanner scan = new Scanner(System.in);
		String id=null, pw=null;
		int choice;

		while (true) {
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.�α׾ƿ�");
			System.out.print(">>>");
			choice = scan.nextInt();
			switch (choice) {
			case 1: 
				System.out.print("���̵� �Է� :");
				id=scan.next();
				System.out.print("��й�ȣ �Է� :");
				pw=scan.next();
				lo.login(id, pw);
				break;
			case 2:
				System.out.print("���� id : ");
				id = scan.next();
				System.out.print("���� pw : ");
				pw = scan.next();
				lo.signUp(id, pw);
				break;
				
			case 3:
				System.out.println("�α׾ƿ� �Ϸ�");
				System.exit(0);

			}

		}
	}
}
