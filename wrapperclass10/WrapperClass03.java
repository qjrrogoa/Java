package wrapperclass10;


public class WrapperClass03 {
	//문] 인자로 전달받은 value가 숫자형식이면 true반환 아니면 false를 반환하는 메소드를
	//	정의해라
	//예] "20" => true, "2041" => false
	
	public static boolean isNumber(String value) {
		boolean check=true;
		for(int i=0;i<value.length();i++) {
			if(!Character.isDigit(Character.codePointAt(value,i)))
				check=false;
		}
		return check;
	}
	

	public static void main(String[] args) {
		// JDK 1.4 이전 버전의 코딩 형태
		char ch ='A';
		Character chObj = new Character(ch);
		char chResult = (char)(chObj.charValue()+1);
		System.out.println("chResult : "+chResult);
		
		// JDK 5.0 이후 버전의 코딩
		chObj='C'; //오토 박싱
		chResult = chObj; //오토 언박싱
		System.out.println("chResult : "+chResult);
		/*
		[Character클래스의 주요 메소드]
		1] static int codePointAt(CharSequence seq,int index)
		:문자열에서 index에 해당하는 위치의 한 문자의 아스키 코드 값을 반한다.
		*/
		System.out.println("[codePointAt메소드]");
		System.out.println(Character.codePointAt("ABCD",2));
		
		/*
		2]static boolean isDigit(char ch)
		static boolean isDigit(int codePoint)
		:어느 한 문자가 숫자인지 아닌지 판단하는 메소드 
		*/
		System.out.println("[isDigit메소드]");
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('2')?"숫자다":"숫자가 아니다");
		System.out.println(Character.isDigit(65)?"숫자다":"숫자가 아니다");
		System.out.println(Character.isDigit(50)?"숫자다":"숫자가 아니다");
		System.out.println(Character.isDigit('가')?"숫자다":"숫자가 아니다");
		System.out.println(Character.isDigit(44032)?"숫자다":"숫자가 아니다");
		
		
		System.out.println("[내가 만든 메소드:isNumber()]");
		System.out.println(isNumber("1004")); // true
		System.out.println(isNumber("100사")); // false
		System.out.println(isNumber("10A4321")); // false
	}/////main
}////class
