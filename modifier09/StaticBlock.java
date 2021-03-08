package modifier09;

public class StaticBlock {
	
	
	public StaticBlock() {
	System.out.println("StaticBlock의 생성자");
	}
	//인스턴스형 멤버]
	int instanceVar;
	void instanceMethod() {}
	//정적 멤버
	static int staticVar;
	static void staticMethod(){
		int localVar=10;
		System.out.println("정적 메소드 : "+localVar);
	}
	//static 블락
	static {
		System.out.println("[static블락 시작]");
		//인스턴스형 멤버 X]
		//System.out.println(instanceVar); //[x]
		//instanceMethod();//[x]
		System.out.println(staticVar);
		staticMethod();
		int localVar=10;
		System.out.println("static 블락안에서 선언된 지역변수 : "+localVar);
		System.out.println("[static블락 끝]");
	}
	/*
	public static void main(String[] args) {
		System.out.println("메인 메소드");
	}/////////main	*/
}/////////class
