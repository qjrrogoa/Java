package datatype01;

import java.math.BigDecimal;
public class SilsuType {

	public static void main(String[] args) {
		/*
		// 실수형에서 대표 자료형은 double이다. 
		// 정수형보다 실수형이 더 큰 그릇이다. float > long
		// long(정수형):8byte, float(실수형):4byte
		long ln =100;
		float f1=200;
		//long ln1=ln+f1;
		// long형과 float형 연산결과는 float다. 
		
		float f2 = ln+f1;
		long ln1=ln+(long)f1;
		ln1=(long)(ln+f1);
		//총 3가지 풀 수 있음 
		
		float kor=99,eng=80,math=96;
		float avg=(kor+eng+math)/3;
		System.out.println(avg);
		System.out.println("평균(소수점 제거):"+(int)avg);
		
		
		float ff1=100, ff2=3.14f, fresult;
		double d1=100, d2=3.14, dresult;
		fresult=ff1+ff2; //[o] float형
		dresult=d1+d2; //[o] double형
		
		int radius=10;
		double pi=3.14;
		int iarea;
		float farea;
		double darea;
		
		iarea=(int)(radius*radius*pi);
		farea=(float)(radius*radius*pi);
		darea=radius*radius*pi;
		System.out.println(iarea);
		System.out.println((int)farea);
		System.out.println((int)darea);
		*/
		// 부동 소수
		// 장점 큰 수를 다룰수 있다.
		// 해결방법 클래스를 이용해야한다.
		double d1=0.1, d2=0.2;
		System.out.println(d1+d2);//예상:0.3
		System.out.println(d1*d2);//예상:0.02
		System.out.println(d1+d2==0.3);
		
		BigDecimal big4 = new BigDecimal("0.1");
		BigDecimal big5 = new BigDecimal("0.2");
		BigDecimal big6 = big4.add(big5);
		System.out.println(big6);
		//
		System.out.println(big6.compareTo(new BigDecimal(0.3)));
		System.out.println(big6.compareTo(new BigDecimal("0.3")));
		
		String a = new String("123");
		String b = new String("124");
		System.out.println(a.compareTo(b));
	}

}
