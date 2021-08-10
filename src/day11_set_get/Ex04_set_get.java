package day11_set_get;

public class Ex04_set_get {
private int age;
private String name;
public int getAge() {
	return this.age-1;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
// public int print(int age) {
//	 this.age=age-1;       실상 getter 와 같다
//	 return this.age;
// }
}
