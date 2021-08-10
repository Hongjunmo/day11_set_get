package day11_set_get;

public class Ex01_Main {
	public static void main(String[] args) {


		Ex01_this ex = new Ex01_this();
		Ex01_this ex01 = ex;
		System.out.println("ex : " + ex);
		System.out.println("ex1 : " + ex);
		ex.a=555;
		ex.func01();
		ex.func02();
		ex01.func02();
	
	}
}
