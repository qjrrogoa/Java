package wrapperclass10;

import java.util.Scanner;

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
//		// JDK 1.4 이전 버전의 코딩 형태
//		char ch ='A';
//		Character chObj = new Character(ch);
//		char chResult = (char)(chObj.charValue()+1);
//		System.out.println("chResult : "+chResult);
//		
//		// JDK 5.0 이후 버전의 코딩
//		chObj='C'; //오토 박싱
//		chResult = chObj; //오토 언박싱
//		System.out.println("chResult : "+chResult);
//		/*
//		[Character클래스의 주요 메소드]
//		1] static int codePointAt(CharSequence seq,int index)
//		:문자열에서 index에 해당하는 위치의 한 문자의 아스키 코드 값을 반한다.
//		*/
//		System.out.println("[codePointAt메소드]");
//		System.out.println(Character.codePointAt("ABCD",2));
//		
//		/*
//		2]static boolean isDigit(char ch)
//		static boolean isDigit(int codePoint)
//		:어느 한 문자가 숫자인지 아닌지 판단하는 메소드 
//		*/
//		System.out.println("[isDigit메소드]");
//		System.out.println(Character.isDigit('A'));
//		System.out.println(Character.isDigit('2')?"숫자다":"숫자가 아니다");
//		System.out.println(Character.isDigit(65)?"숫자다":"숫자가 아니다");
//		System.out.println(Character.isDigit(50)?"숫자다":"숫자가 아니다");
//		System.out.println(Character.isDigit('가')?"숫자다":"숫자가 아니다");
//		System.out.println(Character.isDigit(44032)?"숫자다":"숫자가 아니다");
//		
//		
//		System.out.println("[내가 만든 메소드:isNumber()]");
//		System.out.println(isNumber("1004")); // true
//		System.out.println(isNumber("100사")); // false
//		System.out.println(isNumber("10A4321")); // false		
//		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("나이를 입력하세요 : ");
		String value=sc.nextLine();
		if(isNumber(value)) {
			System.out.println("당신의 10년 후 나이 : "+Integer.parseInt(value));
		}
		else
			System.out.println("나이는 숫자만...");
			*/
		
		/*
		3] static isLette(char ch)
		문자인지 아닌지 판단하는 메소드
		*/
//		System.out.println("[isLetter 메소드]");
//		System.out.println(Character.isLetter('가'));
//		System.out.println(Character.isLetter('A'));
//		System.out.println(Character.isLetter('9'));
//		System.out.println(Character.isLetter('@'));
//		
//		/*
//		4]static boolean isWhitespace(char ch)
//		  static boolean isWhitespace(int codePoint)
//		  공백인지 판단하는 메소드
//		 */
//		System.out.println("[isWhitespace 메소드]");
//		System.out.println(Character.isWhitespace('가'));
//		System.out.println(Character.isWhitespace(' '));//공백의 아스키코드 값 32
//		System.out.println(Character.isWhitespace(32));
//		String  whiteString = "  H   E  L LO ";
//		int whiteCount = 0;
//		for(int i=0;i<whiteString.length();i++) {
//			if(Character.isWhitespace(Character.codePointAt(whiteString, i)))
//				whiteCount++;
//		}
//		System.out.println("총 공백 수는 "+whiteCount+"개");
//		
//		/*
//		5]대소문자를 판단하는 메소드
//		static boolean isLowerCase(char ch)
//		static boolean isUpperCase(char ch)
//		알파벳이 아닌 문자에 적용시 모두 false
//		*/
//		
//		System.out.println("[isLowerCase/isUpperCase 메소드]");
//		System.out.println(Character.isUpperCase('A'));
//		System.out.println(Character.isUpperCase('a'));
//		System.out.println(Character.isLowerCase('A'));
//		System.out.println(Character.isLowerCase('a'));
//		System.out.println(Character.isUpperCase('가'));
//		System.out.println(Character.isUpperCase('1'));
//		
//		System.out.println("[String클래스의 toCharArray()메소드]");
//		String value="KOSMO";
//		char chArray[] = value.toCharArray();
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("아이디를 입력하세요 : ");
		/*
		 * 문] 아이디를 입력받는데 영문자 소문자와 숫자로만 입력받아야한다.
		 * 대문자가 포함되면 "잘못 입력했어요"라고 출력하고 제대로된 아이디를 입력 
		 * 받을 때까지 계속 입력 받도록 하여라.
		 * 단, 숫자로시작해서도 안된다 즉 숫자로 시작한 아이디를 입력 했을때도 
		 * "잘못 입력했어요"라고 출력 하시오.
		 */
		
		/*
		String id;
		Scanner sc = new Scanner(System.in);
			System.out.println("아이디를 입력하세요 : ");
			id=sc.nextLine();
			char ID[]=id.toCharArray();
			if(Character.isDigit(ID[0])) {
				System.out.println("잘못 입력했습니다.");
			}
			for(int i=0;i<id.length();i++) {
				if(Character.isUpperCase(Character.codePointAt(ID, i))){
					System.out.println("잘못 입력했습니다.");
					continue;
				}
				else if (!Character.isLetter(Character.codePointAt(ID, i))) { 
					System.out.println("잘못 입력했습니다.");
					continue;
				}
				else break;
			}
			System.out.println(id+" 만들어졌습니다.");
			*/

		/*
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("아이디를 입력하세요 : ");
			String nickName = sc.nextLine();
			if(nickName.length()<6) {
				System.out.println("아이디는 6자 이상입니다.");
				continue;
			}
			char chNick[]=nickName.toCharArray();
			//옳은 아이디인지 아닌지 판단용 변수
			boolean isCorrect = true;
			for(int i=0;i<chNick.length;i++) {
				if(Character.isDigit(chNick[0]) || 
					!Character.isLowerCase(chNick[i]) &&
					!Character.isDigit(chNick[i])) {
					System.out.println("잘못 입력했어요.");
					isCorrect=false;
					break;
				}
			}////
			if(isCorrect) {
				System.out.println("당신의 이이디는 : "+nickName);
				break;
			}
		}
		*/
		
//		6] 대문자를 소문자로, 소문자를 대문자로
//		static char toUpperCase(char ch)
//		static int toUpperCase(int ch)
//		static char toLowerCase(char ch)
//		static int toUpperCase(int ch)
		
		/*
		System.out.println("[toLowerCase/toUpperCase메소드]");
		System.out.println(Character.toUpperCase('A'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toLowerCase('a'));
		*/
		/*
		//문] 사용자로부터 문자열을 입력받아서
		//대문자는 소문자로, 소문자는 대문자로 변경하여 출력하라.
		
		String alphaString = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("영문자를 입력하세요?");
		String alphabet=sc.nextLine();
		char chalpha[] = alphabet.toCharArray();
		for(int i=0;i<chalpha.length;i++) {
			if(Character.isUpperCase(chalpha[i]))
				//chalpha[i]=Character.toLowerCase(chalpha[i]);
				alphaString+=Character.toLowerCase(chalpha[i]);
			else 
				//chalpha[i]=Character.toUpperCase(chalpha[i]);
				alphaString+=Character.toUpperCase(chalpha[i]);

			//System.out.println(alphaString);
		}
		System.out.println(alphaString);
//		System.out.println("[거꾸로 출력]");
//		for(int i=chalpha.length-1;i>=0;i--)
		*/
		
		/*
		모든 Wrapper클래스는 기본 자료형을 String으로 변환 해줄 수 있는
		아래와 같은 메소드를 공통으로 갖고 있음
		String toString()
		static String to String(기본 자료형 타입)
		 */
		short s = 200;
		// String toString() 사용
		System.out.println(Short.toString(s)+200);
		// static String to String(기본 자료형 타입)
		Short shObj = s; //오토박싱
		System.out.println(shObj.toString()+200);
		
		char ch = '가';
		System.out.println(Character.toString(ch));
		//오토박싱하지 않고 Character valueOf(char)사용 
		System.out.println(Character.valueOf(ch).toString());
		
		boolean b=true;
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.valueOf(b).toString());
		
		//b=TRue;
		String boolString = "TRue";//"TRue"(문자열) -> true(논리값)
		System.out.println(Boolean.parseBoolean(boolString) && false);
		System.out.println(Boolean.valueOf(boolString) && true);
	}/////main
}////class
