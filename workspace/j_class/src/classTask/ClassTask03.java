package classTask;
//동물 클래스 선언

//변수
//이름 나이 체력 먹이개수 먹이종류

//메소드
//먹기 산책하기

//먹기 
//체력 1증가, 먹이개수 1감소

//산책
//체력 1 감소

class Pet{
	
	public Pet() {;}
	//동물의 이름, 나이, 체력, 먹이 갯수, 먹이 종류 선언
	String name;
	int age;
	int health;
	int feedNum;
	String feedKind;
	//필드변수 선언
	public Pet(String name, int age, int health, int feedNum, String feedKind) {
		this.name = name;
		this.age = age;
		this.health = health;
		this.feedNum = feedNum;
		this.feedKind = feedKind;
	}
	void eat() {
		health++;
		feedNum--;
	}
	void walk() {
		health++;
	}
	
}
public class ClassTask03 {
	public static void main(String[] args) {
		
		
	}
}
