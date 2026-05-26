package classTask;

public class Company0 {
	 static long seq;
	   long id;
	   
	   String name;
	   int total;
	   double average;
	   
	   Department0[] arDepartment;
	   
	//   static 블록
	//   최초 1번만 실행
	   static {
	      seq = 0;
	   }
	   
	//   초기화 블록
	   {
	      id = ++seq;
	   }
	   
	   
	   public Company0() {;}


	   public Company0(String name, Department0[] arDepartment) {
	      this.name = name;
	      this.arDepartment = arDepartment;
	      
	      for (int i = 0; i < arDepartment.length; i++) {
	         total += arDepartment[i].income;
	      }
	      
	      average = (double)total / arDepartment.length;
}
}