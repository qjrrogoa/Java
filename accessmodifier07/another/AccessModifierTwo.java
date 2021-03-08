package accessmodifier07.another;
//AccessModifierTwo클래스는 AccessModifierOne과 다른 패키지 안에 있다.
//AccessModifierOne의 멤버(변수,메소드)에 접근해 보자 

import accessmodifier07.AccessModifierOne;

public class AccessModifierTwo {
	//[멤버변수]
	//두 클래스 모두 같은 패키지안에 있기 때문에
	//import할 필요가 없다.
	AccessModifierOne one;
	//[멤버 메소드]
	public void access() {
		one = new AccessModifierOne();
		// one.privateVar=10;// [x] is not visible
		// one.packageVar=10;// [x] is not visible
		one.publicVar=10;// [o]
		// 멤버 메소드에 접근
		// one.privateMethod(); // [x] is not visible
		one.publicMethod();
//		one.packageMethod(); // [x]
//		PackageClass pack = new PackageClass(); // [x]
	}
}
