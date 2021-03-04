package method05;

public class MethodShape01 {
	// [1] 메소드 정의
	// 출력하는 기능 
	static void noParamNoReturn() {
		System.out.println("=========메인 메뉴=========");
		System.out.println("1.New 2.Continue 3.Exit");
		System.out.println("=========================");
	}//noParamNoReturn()
	
	static void noParamNoReturn2() {}
	
	static void noParamNoReturn3() {
		int returnValue=100;
		//return returnValue; 
		//[x] 의미 : returnValue변수에 저장된 값을 반환한다는 의미
		//반환타입이 void로 정의했기 때문에 컴파일에러,
		//System.out.println("return문 이전");
		//return ;// [o] 값을 반환한다는 의미가 아니라 메소드를 바로 빠져 나가겠다는 의미
		//System.out.println("return문 이후"); //[x]
		if(returnValue%2==0) {
			System.out.println(returnValue+"는 짝수");
			return;
		}
		System.out.println(returnValue+"는 홀수");
	}
	public static void main(String[] args) {
	//[2]메소드 호출 : 메소드 원형 그대로 호출
		noParamNoReturn();
		noParamNoReturn2();
		noParamNoReturn3();
	//메소드 안에서는 메소드 정의 불가
	//void noParamNoReturn4() {}
	}/////main
}/////class
