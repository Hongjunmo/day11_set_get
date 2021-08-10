package day11_set_get;

import java.util.Scanner;

public class Ex02_Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Ex02_tihs ex = new Ex02_tihs();
		System.out.print("나이 입력:");
		int a = scan.nextInt();
		ex.agefunc(a);
		ex.printage();
	
	
	
	}
}
