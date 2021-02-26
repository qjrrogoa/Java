package operator02;

public class NolliOP {

	public static void main(String[] args) {
		int num1 = 15, num2 = 10;
		// boolean b = num1 && num2;
		boolean b = num1 >= num2 && num1 ==num2;
		System.out.printf("%d >= %d && %d == %d의 결과 : %b%n",num1,num2,num1,num2,b);
		//false
		b = true||false;
		System.out.printf("%b || &b의 결과: %b%n",true,false,b);
		//true
		b = num1 <= num2 ^ num1 != num2;
		System.out.printf("%d <= %d ^ %d != %d의 결과 : %d",num1,num2,num1,num2,b);
		//true
		b =!(num1 !=num2) || num1>=num2 && num1==num2;
		//true
		b = !true || true ^ false && true;
		//true
		
//		&& 중요
//		Ref ref = new Ref();
//		System.out.println(ref.data);//100
//		Ref ref = null;
//		System.out.println(ref.data);//[x] 에
//		System.out.println(ref);
//		System.out.println("[ && 연산자 사용]");
//		System.out.println(ref !=null && ref.data==100);//[o]false
//		System.out.println("[ & 연산자 사용]");
//		System.out.println(ref !=null & ref.data==100);//[x]에러 
		
	}

}
//class Ref{
//	int data = 100;
//	
//}
