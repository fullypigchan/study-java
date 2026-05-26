package classTask;

public class Student {
   int total;
   double average;
   Subject[] arSubject;
//   기본 생성자 선언
   public Student() {;}
//	 total과 average는 구해야하는 값이므로 매개변수에 집어넣지 않고, 과목 배열만 넣음.	
   public Student(Subject[] arSubject) {
      this.arSubject = arSubject;
    //for문을 이용해 과목 총점과 평균 식 만들기  
      for (int i = 0; i < arSubject.length; i++) {
         total += arSubject[i].score;
      }
      
      average = (double)total / arSubject.length; 
   }
   
}





