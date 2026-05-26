package inheritanceTest;

class A{
	String name;
	int age;
	
	public A() {	System.out.println("부모 생성자 생성됨");
}
	
	public A(String name, int age) {
	this.name = name;
	this.age = age;
}
	
	
}
class B extends A{   //자식의 super는 부모의 기본생성자 super를 데려온다..
	String gender;
	public B() {
System.out.println("자식 생성자 호출됨");
	}
	public B(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}
	
}

public class InheritanceTest01 {
public static void main(String[] args) {
	B b= new B();
}
}
