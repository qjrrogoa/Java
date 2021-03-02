package operator02;

public class HaldangOP {

	public static void main(String[] args) {
	int num1=100, num2;
	num2=num1;
	num1 += 100;
	System.out.println("num1:"+num1);
	num1 %= num2;
	System.out.printf("num1:%d,num2:%d%n",num1,num2); 
	// 0, 200
	num2 *= 2+10;
	System.out.println(num2);
	// 1200
	
	int num3 = 10;
//	num3++; //num3=num3+1
//	++num3;//11 num3=1+num3
	System.out.printf("num3:%d%n",num3);// 11
	int num4 =10;
	int result = num4 + num3++; // 21
	System.out.println(result);
	
	result = num4 + num3;
	System.out.println(result); // 22
	
	result = num4 + ++num3; // 23
	System.out.println(result);
	
	int num5 = 10;
	System.out.println(num5++);//10
	
	
	
	}

}
