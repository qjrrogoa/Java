package array04;

public class ArrayType02 {

	public static void main(String[] args) {
	//1]배열 선언
	int arrNum[][];
	//2]메모리 할당
	arrNum = new int[2][3];
	System.out.println("[초기화 전]");
	for(int i=0;i<2;i++) {
		for(int k=0;k<3;k++) {
			System.out.printf("arrNum[%d][%d]:%-3d",i,k,arrNum[i][k]);
		}
		//줄 바꿈 
		System.out.println();
	}
	arrNum[0][0]=1;
	arrNum[0][1]=2;
	arrNum[0][2]=3;
	arrNum[1][0]=4;
	arrNum[1][1]=5;
	arrNum[1][2]=6;
	System.out.println("[초기화 후]");
	for(int i=0;i<2;i++) {
		for(int k=0;k<3;k++) {
			System.out.printf("arrNum[%d][%d]:%-3d",i,k,arrNum[i][k]);
		}
		//줄 바꿈 
		System.out.println();
	}
	System.out.println("행의 수:"+arrNum.length);
	System.out.println("0행의 열의 수:"+arrNum[0].length);
	System.out.println("1행의 열의 수:"+arrNum[1].length);
	//3] 열의 수를 다르게 할당
	int dynamic[][]=new int[2][];// 0행의 주소 찍으면 안나온다.
	dynamic[0] = new int[3]; //0행의 열의 수를 3개로 할당
	System.out.println("0행의 주소"+dynamic[0]+", 0행의 열의 수 "+dynamic[0].length);
	dynamic[1] = new int[1];
	System.out.println("1행의 주소"+dynamic[1]+", 1행의 열의 수 "+dynamic[1].length);
	System.out.println("[초기화 전]");
	for(int i=0;i<dynamic.length;i++) {
		for(int j=0;j<dynamic[i].length;j++) {
			System.out.printf("dynamic[%d][%d]의 값은 %d ",i,j,dynamic[i][j]);
		}
		// 줄 바꿈
		System.out.println();
	}
	//초기화]
	System.out.println("[초기화 후]");
	for(int i=0;i<dynamic.length;i++) {
		for(int j=0;j<dynamic[i].length;j++) {
			dynamic[i][j]=i+j;
			System.out.printf("dynamic[%d][%d]의 값은 %d ",i,j,dynamic[i][j]);
			}
			System.out.println();
		}
	// 선언과 동시에 초기화
	int arrInit[][]= {{1,2},{1,2,3},{1}};
	for(int i=0;i<arrInit.length;i++) {
		for(int j=0;j<arrInit[i].length;j++) {
			arrInit[i][j]=i+j;
			System.out.printf("(%d행,%d열) : %-3d ",i,j,arrInit[i][j]);
			}
			System.out.println();
		}
	//quiz 1
	/*
	 1 9 9 9 9
	 9 1 9 9 9
	 9 9 1 9 9
	 9 9 9 1 9
	 */
	int a[][] = new int[4][5];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			if(i==j) System.out.printf("%-2d",1);
			else System.out.printf("%-2d",9);
		}
		System.out.println();
	}
	}////main

}//class
