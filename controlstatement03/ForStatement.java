package controlstatement03;

public class ForStatement {

	public static void main(String[] args) {
		
	int sum = 0;
	for(int i=1;i<=10;i++)
	{
		sum+=i;
	}
	System.out.println("1부터 10까지 누적합:"+sum); // 55
	
	//1부터 10까지 숫자중 2의 배수의 합:
	//방법1] 2씩 증가하도록
	// 5번 반복 (효율적)
	for(int i=2;i<=10;i+=2) {
		sum+=i;
	}
	System.out.println("1부터 10까지 숫자 중 2의 배수의 합"+sum);
	
	//방법2] i의 값이 2의 배수인 경우
	// 10번 반복 
	for(int i=1;i<11;i++)
	{
		if(i%2==0) sum+=i;
	}
	System.out.println("1부터 10까지 숫자 중 2의 배수의 합"+sum);
	
	//System.out.println("for문이 끝난 후 i의 값:"+i);
	//for안에서 선언한 변수는 for 끝나면 없어진다.
	//선언하고 싶으면 int i; for(;i<11<i++) 이렇게 사용 가능하다.

		
	// quiz1]
	// 3배수 5배수 합, 대신 공배수는 한번 만 더해라.
	sum=0;
	for(int i=1;i<=100;i++){
		// 내 풀이 
		if(i%3==0) sum+=i;
		if(i%5==0) sum+=i;
		if(i%15==0) sum-=i;
		// 선생님 풀이
		// if(i%3==0||i%5==0) sum+=i;
	}
	System.out.println(sum);
	
	// quiz2]
	// 1에서 15 아예 제외 
	sum=0;
	for(int i=1;i<=100;i++) {
		// 내 풀이
		if(i%3==0) sum+=i;
		if(i%5==0) sum+=i;
		if(i%15==0) sum-=i;
		if(i%15==0) sum-=i;
		if(i%3==0||i%5==0) sum+=i;
		if(i%3==0&&i%5==0) sum-=i;
		 //선생님 풀이 1.
		 if((i%3==0||i%5==0) && i%15!=0) sum+=i;
		 //선생님 풀이 2.
		 if(i%3==0 ^ i%5==0) sum+=i;
	}
	System.out.println(sum);

	int repeatCount=1;
	for(int k=0;k<3;k++) {
		System.out.printf("[k가 %d일 때]%n",k);
		for(int j=1;j<=3;j++) {
			System.out.printf("j는 %d, 반복횟수:%d%n",j,repeatCount++);
		}
	}
	/*
	0 0 0 1 (1,4)
	0 0 1 0 (2,3)
	0 1 0 0 (3,2)
	1 0 0 0	(4,1)
	 */
	// 방법1]
	System.out.println("[증가 연산자 사용]");
	for(int k=1;k<=4;k++) {
		for(int j=1;j<5;j++) {
			if(k+j==5) System.out.printf("%-2d",1);
			else System.out.printf("%-2d",0);
		}
		//줄 바꿈
		System.out.println("");
	}
	// 방법2]
	System.out.println("[감소 연산자 사용]");
	for(int k=1;k<=4;k++) {
		for(int j=4;j>=1;j--) {
			if(k==j) System.out.printf("%-2d",1);
			else System.out.printf("%-2d",0);
		}
		//줄 바꿈
		System.out.println("");
	}
	/*
	 *
	 * *
	 * * *
	 * * * *
	 * * * * * 출력하기
	 */
	System.out.println("[25번 반복]");
	for(int k=1;k<=5;k++) {
		for(int j=1;j<=5;j++) {
			if(k >= j) System.out.printf("%2c",'*');
		}
		//줄 바꿈
		System.out.println("");
	}
	System.out.println("[15번 반복]");
	for(int k=1;k<=5;k++) {
		for(int j=1;k >= j;j++) {
			System.out.printf("%2c",'*');
		}
		//줄 바꿈
		System.out.println("");
	}
	
	// quiz1] 구구단 출력
	for(int k=1;k<=9;k++) {
		for(int j=2;j<=9;j++) {
			System.out.printf("%d * %d = %-4d",j,k,k*j);
		}
		System.out.println("");
	}
	System.out.println("프로그램 끝");
	}//// main
}//// class
