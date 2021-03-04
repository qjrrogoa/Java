package controlstatement03;

public class ParkDaeMin0303 {

	public static void main(String[] args) {
		System.out.println("FOR 문");
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				if(i<=j) System.out.printf("%-2s",'*');
			}
			System.out.println("");
		}
		
		System.out.println("WHILE 문");
		int i=0;
		while(i<=4) {
			int j=0;
			while(j<=4) {
				if(i<=j) System.out.printf("%-2s",'*');
				j++;
			}
			i++;
			System.out.println("");
		}

	}///main
}///class
