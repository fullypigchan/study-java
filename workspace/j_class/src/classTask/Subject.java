package classTask;

public class Subject {
   String name;
   int score;
   
   public Subject() {;}
   //과목 이름과 점수만 있으면 되기 때문에 클래스 생성
   public Subject(String name, int score) {
      this.name = name;
      this.score = score;
   }
}
