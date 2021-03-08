package accessmodifier07;

class PackageClass{} // [9]생략형 (패키지/디폴트)

public class AccessModifierOne {
	//[멤버 변수]
	public int publicVar;
	int packageVar;
	private int privateVar;
	
	//[멤버 메소드]
	public void publicMethod() {
	
	}
	
	void packageMethod() {
		//다른 클래스에서 직접 호출이 불가능하니까
		//접근이 가능한 메소드에서 호출 
		privateMethod();
	}
	

	private void privateMethod() {
		System.out.println("privateVar : " + privateVar);
	}
}
