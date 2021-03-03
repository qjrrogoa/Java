package controlstatement03;

public class BreakContinue {

	public static void main(String[] args) {

		int i=0;
		while(i<10) {
			i++;
			System.out.printf("[i가 %d일 때]%n",i);
			System.out.println("continue문 이전 출력문");
			if(i%2==0)continue;
			System.out.println("continue문 이후");
			System.out.println("break문 이전 출력문");
			if(i==3) break;
			System.out.println("break문 이후 출력문");
			}
		// 아래처럼 레이블을 이용해 안쪽 for문이 아닌 바로 바깥 for문을 
		// 빠져 나갈수 있으나 권장하지 않는다.
		outer : for(i=0;i<3;i++) {
			for(int k=0;k<3;k++)
				System.out.printf("Hello : i=%d,k=%d%n",i,k);
				break outer;
		}
		
	}///////main	
}////////class
