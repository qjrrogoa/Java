package inheritance16;

public class Animal {
	String species;
	int year;
	String gender;

	//[생성자]
	//기본 생성자]
	public Animal() {}

	public Animal(String species, int year, String gender) {
		this.species = species;
		this.year = year;
		this.gender=gender;
	}
	
	void printAnimal() {
		System.out.print(String.format("종 : %s, 나이 : %s, 성별 : %s",
				species,
				year,
				gender));
	}
}
