package operator02;

public class BitOP {

	public static void main(String[] args) {
		// 비트 연산은 비트 단위로 계산
		// 이항 연산자 
		// 두 항이 반드시 정수여야한다.
		
	byte b1= 10, bit1=2;
	int result = b1 << bit1;
	// 왜 int로 했나? byte byte 연산하면 int가 된다.
	System.out.printf("%d << %d의 결과 : %d%n",b1,bit1,result); // 40
	b1=-9;
	result = b1 >> bit1;
	System.out.printf("%d << %d의 결과 : %d%n",b1,bit1,result); // -3
	b1=3;
	byte b2= -15;
	System.out.println("논리 연산자로 사용된 경우:"+(true & 10 > 100)); // false
	System.out.println("비트 연산자로 사용된 경우(and 연산):"+(b1 & b2)); // 1
	System.out.printf("%d & %d의 결과 : %d%n",b1,b2,b1&b2); // 1
	System.out.printf("%d | %d의 결과 : %d%n",b1,b2,b1|b2); // -13
	System.out.printf("%d ^ %d의 결과 : %d%n",b1,b2,b1^b2); // -14
	System.out.printf("~%d의 결과 :%d%n",b2,~b2);// 14
	}

}
