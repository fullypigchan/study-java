package classTask;

// 화면
// 학생의 과목 정보를 입력받은 뒤 총점과 평균을 출력한다. 

//(결국 과목의 점수가 객체가 되어
// 과목명과 점수를 입력받아야하고, student에서는 과목 점수의 총점과 평균의 정보를 가져온다)

// 학생의 과목 정보는 생성자로 초기화한다.
// 과목 정보는 점수와 과목명이 있으며, 학생 한 명당 여러 과목 정보를 가지고 있다.
// Student.java, Subject.java

//student와 subject 클래스를 생성한다.
//student에서는 학생의 총점, 평균, 과목 정보를 생성
//subject에서는 과목명과 점수 생성
public class ClassTask04 {
   public static void main(String[] args) {
      Subject[] arSubject = {
         new Subject("국어", 30),   
         new Subject("영어", 80),   
         new Subject("수학", 100)   
      }; //객체 생성은 main에서
      
      Student 한동석 = new Student(arSubject);
      
      System.out.println(한동석.total);
      System.out.println(한동석.average);
   }
}















