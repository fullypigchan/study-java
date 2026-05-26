package classTest;

class Car{
	public Car() {;} //기본 생성자는 그냥 만들어놔라!
	
	String brand;
	int price;
	String color;
	
	
	Car(String brand,int price,String color){
		
		this.brand=brand;
		this.price=price;
		this.color=color;
	}

	Car(String brand,int price){
		
		this.brand=brand;
		this.price=price;
	}
Car(String brand){
		
		this.brand=brand;
}
//	오버로딩- 매개변수 수가 다르다면 이름이 겹쳐도 상관 없다.
	void printInfo() {
		System.out.println(brand+","+price+","+color); //지역변수에 해당 변수가 없을 때는 this 안붙여도됨.
	}
}

public class ClassTest02 {
public static void main(String[] args) { //프로그래밍시 메인 메소드 안에서 실행

	Car mom = new Car("benz",10000,"black");
	Car daddy = new Car("Bmw");
	Car myCar = new Car("morning",10000);
	 	mom.printInfo();
	 	daddy.printInfo();
	 	myCar.printInfo();
}
}
