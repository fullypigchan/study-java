package classTest;

class A{ 
	//전역 변수(global variable): 프로그램 종료시 메모리 해제
//	->전역 변수는 자동초기화(컴파일러가 기본 생성자를 생성해줌: public 클래스명(){;}
	int data; //BSS라는 영역에 저장
	 
	void printData() {
	//지역 변수(local variable): 해당 영역이 끝날 때(닫는 중괄호}를 만날 때)
//	->지역 변수는 직접 초기화
		int data=10; //STACK라는 영역에 저장
		System.out.println(data); //지역변수 데이터
		System.out.println(this.data); //그 주소에 있는 데이터
		System.out.println(this);
	}
}
public class ClassTest01 {
public static void main(String[] args) {
	A a1 = new A(); //생성자 호출
	A a2 = new A(); //객체 선언 a1, a2             
	a1.data=100;
	a1.printData();
	System.out.println(a1); //객체 주소가 this.data에 있는 주소와 같나?
	
	a2.data=20;
	a2.printData();
	System.out.println(a2);
}
}
