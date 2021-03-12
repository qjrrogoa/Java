package constructor15;

//싱글톤으로 미 설계시
class NoSingleTone{
	//[멤버 변수]
	int noShareVar;
	//[멤버 메소드]
	void print() {
		System.out.println("noShareVar : "+noShareVar);
	}
}

//싱글톤으로 설계시
class SingleTone{
	//[멤버 변수] 
	int shareVar;
	private static SingleTone single = new SingleTone();
	//[생성자]
	//1.접근지정자를 private으로 지정
	private SingleTone() {}
	//[멤버 메소드]
	//2. 정적 메소드로 해당 클래스의 객체를 반환하도록 정의한다.
	public static SingleTone getInstance() {
		return single;
	}
	void print() {
		System.out.println("shareVar : "+shareVar);
	}
	
}
	
public class SingleToneDesign {

	public static void main(String[] args) {
	//싱글톤으로 미 설계시]
	//new할때마다 메모리가 생긴다.
	NoSingleTone no1 = new NoSingleTone();
	no1.noShareVar = 100;
	no1.print();
	
	NoSingleTone no2 = new NoSingleTone();
	no2.noShareVar =200;
	no2.print();
	
	System.out.println(String.format("no1 : %s%nno2 : %s%nno1의 noShareVar : %s%nno2의 noShareVar : %s",
			no1,no2,no1.noShareVar,no2.noShareVar));		
	
	//싱글톤으로 설계시]
	//SingleTone st1 = new SingleTone();
	SingleTone st1 =SingleTone.getInstance();
	st1.shareVar = 100;
	st1.print();
	
	SingleTone st2 =SingleTone.getInstance();
	st2.shareVar = 200;
	st2.print();
	System.out.println(String.format("st1 : %s%nst2 : %s%nst1의 shareVar : %s%nst2의 shareVar : %s",
			st1,st2,st1.shareVar,st2.shareVar));
	
	
	}//////main
}/////class
