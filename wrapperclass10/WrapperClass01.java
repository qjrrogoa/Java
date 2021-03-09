package wrapperclass10;

public class WrapperClass01 {

	public static void main(String[] args) {
		/*
		 * JDK 1.4 이전 버전에서의 코딩 형태
		 * 기본 자료형으로 + 연산]
		 */
		int num1 = 200;
		int num2 = 20;
		int result = num1+num2;
		System.out.println("result = "+result);
		//Wrapper클래스로 +연산]
		Integer num1Obj = new Integer(200);
		Integer num2Obj = new Integer(20);
		//System.out.println(num1Obj+num2Obj);//[x] JDK1.4 이전 버전에서
		result = num1Obj.intValue()+num2Obj.intValue();//[o] JDK 1.4이전 버전에서
		System.out.println("result = "+result);
		// 기본 자료형은 멤버가 없다. // num1.
		Integer num1Object = new Integer(num1);
		System.out.println("num1(int)을 byte형 값으로 변경 : "+num1Object.byteValue());
		System.out.println((byte)num1);
		System.out.println("num1(int)을 이진수 값으로 변경 : "+Integer.toBinaryString(num1));
		System.out.println("num1Objcet : "+num1Object);
		System.out.println("num1Objcet.toString() : "+num1Object.toString());
		/*
		 * JDK 5.0 이후의 코딩 형태
		 */
		num1Obj = num1; //int -> Integer 오토박싱이 일어남
		int num3 = num1Object; // Integer int 오토언박싱
		Integer num3Obj = 300; // 오토박싱
		/*
		 * Wrapper클래스를 사용하는 이점: 
		 * Wrapper클래스 안의 많은 메소드 사용가능 
		 * 고로 쉽게 정수를 이진수로 혹은 8진수로 쉽게 변환 가능
		 */
		System.out.println("byte형 최대값 : "+Byte.MAX_VALUE);
		System.out.println("byte형 최소값 : "+Byte.MIN_VALUE);
		System.out.println("num1을 8진수로 변경 : "+Integer.toOctalString(num1));
		System.out.println(0310);
		System.out.println("num1을 16진수로 변경 : "+Integer.toHexString(num1));
		System.out.println(0xc8);
		/*
		 * 자바의 모든 클래스들은 Object라는 최상위 클래스로부터 상속을 받는다.
		 * Wrapper클래스들은 Object로부터 상속받은 to String() 메소드를 
		 * 오버라이딩하여 인스턴스 변수 출력시 주소가 아니라 
		 * 실제 값이 반환되도록 오버라이딩 되었다
		 */
	
		Integer remodel = new Integer(99);
		System.out.println("remodel = "+remodel);
		System.out.println("remodel.toString() = "+remodel.toString());
		System.out.println("remodel의 클래스 = "+remodel.getClass().getName());
		System.out.println(remodel.hashCode());
		WrapperClass01 wc = new WrapperClass01();
		System.out.println("wc"+wc);
		System.out.println("wc.toString()"+wc.toString());
	}//////main
}/////class
