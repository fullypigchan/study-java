package soloPractice;

public class User {
//회원마다 여러 운동을 할 수 있다.
//테니스 10칼로리, 배드민턴 30칼로리..
	String name;
	int age;
	Exercise[] arExe;
	int total;
	
	public User() {;}
	
	public User(String name, int age, Exercise[] arExe) {
		this.name = name;
		this.age = age;
		this.arExe = arExe;
		
		for (int i = 0; i < arExe.length; i++) {
			total+=arExe[i].calorie;
		}
	}
	
	
}
