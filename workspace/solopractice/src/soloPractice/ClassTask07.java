package soloPractice;
//회원마다 여러 종류의 운동을 한다.
//진행한 운동마다 칼로리를 기록한다.
//이 때, 회원들은 각각 운동한 총 칼로리를 계산할 수 있다.

//회원(User)
//회원번호
//이름
//나이

//운동(Exercise)
//종목명
//칼로리(정수)
public class ClassTask07 {
	public static void main(String[] args) {
		
		Exercise[] arExe= {
			new Exercise("테니스", 300),
			new Exercise("배드민턴", 250),
			new Exercise("농구", 600)
		};
		User user1=new User("김윤찬", 27, arExe); //김윤찬 회원이 27살에 이 운동을 했다!
	int result=user1.total;
	System.out.println(user1.name+"의 소모된 칼로리는 "+result+"kcal 입니다");	
	
		
	}
}
