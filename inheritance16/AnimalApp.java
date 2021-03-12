package inheritance16;

public class AnimalApp {


	public static void main(String[] args) {
		Dog dog = new Dog("포유류",2,"수컷","시바");
		dog.printDog();
		dog.bark();
		
		//자식이 아닌 다른 클래스에서 부모(Animal) 멤버(year)에 접근하려면 
		System.out.println("Dog클래스의 year : "+dog.year);
		System.out.println("Animal의 year : "+dog.getSuperYear());
	}
}
