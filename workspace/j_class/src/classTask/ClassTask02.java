package classTask;

// 회원의 정보를 저장할 클래스 선언
// 아이디, 비밀번호
// 저장소에 있는 아이디는 항상 "test"이고 비밀번호는 항상 "1234"이다.

// 아이디 중복검사
// 전달받은 아이디가 이미 있는 아이디인지 boolean으로 리턴한다.

// 로그인
// 로그인 성공 혹은 실패에 대한 결과를 boolean으로 리턴한다.
class Member {
	//id와 password 선언.
   String id;
   String password;
   //기본 생성자
   public Member() {;}
   //필드 선언
   public Member(String id, String password) {
      this.id = id;
      this.password = password;
   }
   //메소드 -> 아이디 검사 -> equals를 이용하여 "test"와 같은지 확인
   static boolean checkId(String id) {
      return id.equals("test");
   }
   //로그인은 id와 password를 모두 확인해야함. equals를 이용하여 확인.
   static boolean login(String id, String password) {
      return id.equals("test") && password.equals("1234");
   }
   
}

public class ClassTask02 {
   public static void main(String[] args) {
     //id password 값 할당.
	  String id = "test";
      String password = "1234";
      //Member에 있는 아이디 중복 검사 메소드 리턴값
      boolean isDup = Member.checkId(id);
      System.out.println(isDup);
      //Member에 있는 로그인 검사 메소드 리턴값
      boolean isMember = Member.login(id, password);
      System.out.println(isMember);
   }
}






