package wrapperclass10;

import java.util.Scanner;

public class WrapperClass02 {

	public static void main(String[] args) {
		/*
		 [Integer Wrapper클래스의 주요 메소드]
		   1] 숫자형식의 문자열을 숫자로 변경
				static int parseInt(String s) ;
				static Integer valueOf(String s);
				반드시 숫자형이여야 한다,
		 */
		
		String strNumber="1000";
		System.out.println("10+strNumber"+(10+strNumber)); //10100
		System.out.println("strNumber를 숫자로 변경(첫번째)"+(10+Integer.parseInt(strNumber)));
		System.out.println("strNumber를 숫자로 변경(두번째)"+(10+Integer.valueOf(strNumber)));
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("나이를 입력하세요 : ");
		//1-1] nextInt()받는 경우
		//int age = sc.nextInt();
		//System.out.println("당신의 10년후 나이 : "+(age+10)+"살");
		
		//1-2] nextLine()받는 경우
		//String ageString= sc.nextLine(); // 사전 전처리가능
		//System.out.println("당신의 10년후 나이 : "+(age+10)+"살");
		//System.out.println("당신의 10년후 나이 : "+(Integer.parseInt(ageString)+10)+"살");
		Integer numObj = Integer.parseInt(strNumber);
		System.out.println("문자열 1000을 byte형 값으로 변경(parseInt) : "+numObj.byteValue());
		System.out.println("문자열 1000을 byte형 값으로 변경(valueOf) : "+Integer.valueOf(strNumber).byteValue());
		String money = "1억원";
		//Integer.parseInt(money); [x]
		//Integer.valueOf(money); [x]
		String floatString = "3.14";
		//Integer.parseInt(floatString); [x]
		System.out.println(Float.parseFloat(floatString));
		System.out.println(Double.parseDouble(floatString));
		
		/*
		2] 2진수, 8진수, 16진수형식의 문자열을 
		십진수로 바꿀때 사용하는 메소드
			static int parseInt(String s, int radix)
			static int valueOf(String s, int radix)
		*/
		
		System.out.println("2진수 형태의 문자열 1000을 십진수로 : "+Integer.parseInt(strNumber,2));
		System.out.println("8진수 형태의 문자열 1000을 십진수로 : "+Integer.parseInt(strNumber,8));
		System.out.println("16진수 형태의 문자열 1000을 십진수로 : "+Integer.parseInt(strNumber,16));

		/*
		3] 숫자를 문자열로 변경 
			static String toString(int i);
			String toString();
		 */
		int num2=1000;
		//3-1]정적 메소드 사용 
		System.out.println(Integer.toString(num2)+10);
		//3-2]인스턴스형 메소드 사용
		Integer intObj = num2;
		System.out.println(intObj.toString()+10);
		
		/*
		4] 십진수를 각 진수로 변환
			static String toBinaryString(int i)
			static String toOctalString(int i)
			static String toHexString(int i)
		*/
		int num3=15;
		System.out.println(Integer.toHexString(num3));
		
	}/////main
}/////class
