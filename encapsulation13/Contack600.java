package encapsulation13;

public class Contack600 {
	//멤버 변수]
	SneezeCap sneeze = new SneezeCap();
	SniffleCap sniffle = new SniffleCap();
	SnivelCap snivel = new SnivelCap();
	
	//멤버 메소드
	void take() {
		//복용순서가 중요하다]
		//재채기 -> 콧물 -> 기침 
		sneeze.take();
		snivel.take();
		sniffle.take();
	}
}
