package staticTest;
// static 
//모든 객체가 공유하는 값
//클래스당 한 개만 만들어지기 때믄에 객체가 아닌 클래스명으로 접근한다.
//생성자가 아니라 컴파일러가 메모리에 가장 먼저 할당해준다.

class Data{
	
	int data;
	static int data_s =10; //원래 언더바 쓰면 안됨.
	public Data() {;}
	
	public Data(int data) {
		this.data = data;
	}
	void increase() {
		System.out.println(++data);
	}
	static void increase_s() {
		System.out.println(++data_s);
	}
}
public class StaticTest {
public static void main(String[] args) {
//	Data data1=new Data(10);
//	Data data2=new Data();
//
//	data2=new Data();
//	Data.increase_s();
//	Data.increase_s();
//	Data.increase_s();
//	Data.increase_s();
//	Data.increase_s();
	
	
	//스태틱은 생성자의 영역이 아니다. 생성자로 메모리애 올라가는 것이 아니다.생성자로 올라가면 초기화됐어야함.				
	//컴파일러가 메모리에 바로 올려줌. 스태틱은 딱 1개만 생김. new랑 상관없음.					
	//스태틱은 어떤 객체에도 동일하게 적용돼야함. 모든 객체가 공유하는 값. ex)자동차 규정속도, 회사매출
//	data2.increase_s();
//	data2.increase_s();
//	data2.increase_s();
//	data2.increase_s();
//	data2.increase_s();  잘못된 표기법
//	data1.increase();
//	data1.increase();
//	data1.increase();
//	data1.increase();
//	
//	data1=new Data(10);
//	
//	data1.increase();
//	data1.increase();
//	data1.increase();
//	data1.increase();
//	data1.increase();
}
}
