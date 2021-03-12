package polymorphism14;

import java.util.Date;

public class Parent {
	//[멤버 변수]
	String name;
	int age;
	
	//[생성자]
	//기본 생성자]
	public Parent() {}

	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//[멤버메소드]
	private void eat() {
		System.out.println("부모님이 드신다.");
	}
	
	String sleep(int age) {
		System.out.println("부모님이 주무신다.");
		return null;
	}
	
	protected int walk(Date date) {
		System.out.println("부모님이 산책하신다.");
		return 0;
	}
	
	public void exercise() {
		System.out.println("부모님이 운동하신다.");
	}
	
	static void staticMethod() {
		System.out.println("부모님의 정적 메소드");
	}
	
	String getParent() {
		return String.format("성함 : %s, 연세 : %s",name,age);
	}
	
	void printParent() {
		System.out.println(getParent());
	}
	
}///class
