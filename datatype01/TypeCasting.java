package datatype01;

public class TypeCasting {

	public static void main(String[] args) {
	byte b1=65;
	short s1;
	s1=b1;// 자동 형 변환 
	System.out.println("b1은"+b1+" s1는 "+s1);
	int num1 = s1+b1;// 얘네는 형 변환이 아니다.

	//char ch1=b1; //[x] b1은 부호가 있고, ch1은 부호가 없다.
	char ch1=(char)b1;//[o] 강제적 형 변

	//데이터 미손실 
	short s2=100; //byte b2=s2;//[x] 오류
	byte b2=(byte)s2;
	System.out.println("데이터 미 손실]s2는 "+s2+" b2는 "+b2);
	
	//데이터 손실 
	int num3=300;
	//b2=num3;//[x]
	b2=(byte)num3;
	System.out.println("데이터 손실]b2는 "+b2+" num3는 "+num3);
	
	
	double dl=3.14;
	//int num4 = num3+dl;//[x]
	int num4 = (int)(num3+dl);
	int num5 = num3+(int)dl;
	double dl2 = num3+dl;
	}

}
