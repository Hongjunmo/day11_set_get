package day11_set_get;

public class Ex03_set_get {
	// 보통 필드(인스턴스멤버)는 private로 짓고 공개된 메서드를 이용해 값에 접근할수 있도록
	// 하는게 국룰이라고 함

	private int num;
	private int age;
	private String name;
	
	public void setNum(int num) {
		this.num = num;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getNum() {
		return num;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}
