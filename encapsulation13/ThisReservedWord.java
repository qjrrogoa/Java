package encapsulation13;
/*
 * this 자기자신의 클래스를 지칭한다.
 * - 인스턴스형 멤버에 접근할 때 사용하는 키워드
 * (반드시 메소드안에서 사용)
 * -this 키워드는 정적 메소드에서 사용할 수 없다.
 * 즉 static 안붙은 인스턴스형 메소드 안에서만 사용 가능.
 * 지역변수와 멤버변수 구분할 때 주로 사용
 *
 */
public class ThisReservedWord {
	//this.[x] 항상 인스턴스형 메소드 안에서만 사용 가능
	//[인스턴스형 멤버]
	int instanceVar, anotherInstanceVar;
	void instanceMethod() {
		//this는 인스턴스형 메소드 안에서 사용가능
		//this.하면 자기 자신의 모든 멤버가 뜬다.
		System.out.println(this.instanceVar);//[o]
		//정적 멤버도 this키워드로 접근 가능하지만
		//in a static way으로 접근하려고 경고가 나온다.
		System.out.println(this.staticVar);
		System.out.println(ThisReservedWord.staticVar);//[O]경고 안뜸
	}///////instanceMethod
	
	//[정적 멤버]
	static int staticVar;
	static void staticMethod() {
		//this.[x] 정적 메소드안에서는 사용 불가.
	}///////staticMethod
	
	
	//지역변수와 멤버변수 구분할 때 주로 사용 예]
	void initialize(int instanceVar,int another,int staticVar) {
		this.instanceVar = instanceVar;
		anotherInstanceVar=another;
		ThisReservedWord.staticVar=staticVar;
	}////initialize
	
	
	public static void main(String[] args) {
		//[인스턴스화]
		ThisReservedWord reserved = new ThisReservedWord();
		reserved.initialize(10,100,1000);
		System.out.println("[멤버 변수 초기화 후]");
		System.out.println("reserved.instanceVar : "+reserved.instanceVar);
		System.out.println("reserved.anotherInstanceVar : "+reserved.anotherInstanceVar);
		System.out.println("staticVar : "+staticVar);

	
	}///////main
}///////class
