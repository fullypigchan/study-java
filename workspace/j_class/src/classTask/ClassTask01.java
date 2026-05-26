package classTask;

//동물 이름이 3마리 있다.
//모든 동물은 이름, 나이, 성별이 있다.
//3마리 동물은 각자 자기소개를 할 수 있다.
//클래스를 활용하여 3마리 동물이 자기소개할 수 있도록 구현한다.
 class Animal {
	//전역 변수로 동물의 이름, 나이, 성별 선언.(전역 변수는 자동 초기화)
	String name;
	int age;
	String sex;
	//기본 생성자 생성.
	public Animal() {;}
	//필드 선언 alt+shift+o 누르면 자동 선언.
	Animal(String name, int age, String sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	//메소드 부분. 이름 나이 성별 출력
  void printInfo() {
//	System.out.println(name+","+age+","+sex);
	  System.out.println("이름: "+name);
	  System.out.println("나이: "+age);
	  System.out.println("성별: "+sex);
}
 }
public class ClassTask01 {

	public static void main(String[] args) {
//	화면
	//동물이 여러마리이므로 배열 생성
	//클래스명[] 후 각 동물 이름 나이 성별 입력
		Animal[] arAnimal= {
				new Animal("바둑이",5,"수컷"),
				new Animal("호범이",8,"암컷"),
				new Animal("바둑이",5,"암컷")
		};
		//반복문 이용해 출력
		 for (int i = 0; i < arAnimal.length; i++) {
	         arAnimal[i].printInfo();
	      }
		
		
//	Animal hippo=new Animal("하마",10,"수컷");
//	Animal girrafe=new Animal("기린",12,"암컷");
//	Animal pig=new Animal("돼지",15,"수컷");
//		
//	hippo.printInfo();
//	girrafe.printInfo();
//	pig.printInfo();

}
 }	
	

