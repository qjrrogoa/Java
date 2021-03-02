package datatype01;

public class JungsuType {

	public static void main(String[] args) {
	/*
	 자료형 연산
	 
		byte b1=10,b2=20;
		b3=b1+b2;  이걸 하려면 세 가지 방법 있다.
		
		1)
		byte b3=10+20;
		
		2) 
		byte b3=(byte)(b1+b2);
		
		3)
		int b3=b1+b2
		
		또 다른 방법 
		int a=100;
		long b=200;
		c= a+(int)b
		c는 int
	
		long ln4=220000000L
		정수는 반드시 int로 저장된다 그래서 그래서 long으로 지정하려면 L을 붙여야함 
	
		int num4=0412;
		System.out.println(num4);
		// 숫자앞에 0 붙으면 8진수 된다.
		// 숫자앞에 0X 붙으면 16진수 된다.
		num4 = 0x1F;
		System.out.println(num4);
		*/
		int Kor=89, Eng=99, Math=78, Total;
		Total=Kor+Eng+Math;
		System.out.println("국어:"+Kor+" 영어:"+Eng+" 수학:"+Math+" 총점:"+Total+"이다.");
		
	}
}
