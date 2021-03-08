package modifier09;

//static class StaticCalss{}
class MyStatic{
	// [멤버 변수]
	// 인스턴스형 멤버 변수]
	int instanceVar;
	// 정적 멤버변수]
	static int staticVar;
	
	// [멤버 메소드]
	// 인스턴스형 메소드]
	// 모든 멤버를 사용할 수 있다.
	void instanceMethod() {
		System.out.println(instanceVar);//[o]
		System.out.println(staticVar);//[o]
	}
	//정적 메소드]
	// 인스턴스형 메소드를 사용 할 수 없다.
	// why?? 인스턴스화 변수는 인터프리터 할 때 만들어 진다.
	static void staticMethod() {
		//System.out.println(instanceVar);//[x]
		System.out.println(staticVar);//[o]
	}
}//////MyStatic

public class StaticModifier {

	
	//인스턴스형 멤버]
	int instanceVar;
	void instanceMethod() {}
	//정적 멤버
	static int staticVar;
	static void staticMethod(){}
	
	public static void main(String[] args) {
		System.out.println(MyStatic.staticVar);
		MyStatic.staticMethod();
		MyStatic ms = new MyStatic();
		System.out.println(ms.instanceVar);
		ms.instanceMethod();
		//같은 클래스 안이라 static .class 안해도 됨
		System.out.println(staticVar);
		staticMethod();
		StaticModifier sm = new StaticModifier();
		System.out.println(sm.instanceVar);
		sm.instanceMethod();
		StaticModifier sm1 = new StaticModifier();
		
		System.out.println("[멤버변수 x,y가 인스턴스형인 경우]");
		Calculator1 cal1 = new Calculator1();
		cal1.x=10;
		cal1.y=10;
		cal1.add();
		
		Calculator1 cal2 = new Calculator1();
		cal2.x=100;
		cal2.y=100;
		cal2.add();
		
		System.out.println("[cal1계산기 add()다시 호출]");
		cal1.add();
	
		System.out.println("[멤버변수 x,y가 정적인 경우]");
		Calculator2 c1 = new Calculator2();
		Calculator2.x=10;
		Calculator2.y=10;
		c1.add();
		
		Calculator2 c2 = new Calculator2();
		Calculator2.x=100;
		Calculator2.y=100;
		c2.add();
		System.out.println("[c1계산기 add()다시 호출]");
		c1.add();
		

	}/////main
}/////class

//멤버변수가 인스턴스형 인 경우
class Calculator1{
	//멤버 변수]
	int x,y;
	//멤버 메소드
	void add() {
		System.out.println("덧셈 결과 : " + (x+y));
	}
}
//멤버변수가 정적인 경우
class Calculator2{
	//멤버 변수]
	static int x,y;
	//멤버 메소드]
	void add() {
		System.out.println("덧셈 결과 : " + (x+y));
	}
}
