package classTask;

public class CompanyDepartmentTask {
	// 부서별 매출 관리

	// 회사 클래스
	// 회사 번호
	// 부서 이름
	// 부서 매출

	// 회사 1개 당, 여러 부서가 있다.
	// 회사는 부서별 총 매출과 평균 매출을 구할 수 있다.
	// Company.java, Department.java
	public class ClassTask05 {
	   
	   public static void main(String[] args) {
	      // 화면
	      Department0[] arDepartement = {
	         new Department0("개발", 4500),   
	         new Department0("기획", 8500)   
	      };
	      
	      Company0 naver1 = new Company0("naver", arDepartement);
	      Company0 naver2 = new Company0("naver", arDepartement);
	      Company0 naver3 = new Company0("naver", arDepartement);
	      Company0 naver4 = new Company0("naver", arDepartement);
	      Company0 naver5 = new Company0("naver", arDepartement);
	      Company0 naver6 = new Company0("naver", arDepartement);
	      
	      System.out.println(naver1.total);
	      System.out.println(naver1.average);
	      
	      System.out.println(naver1.id);
	      System.out.println(naver2.id);
	      System.out.println(naver3.id);
	      System.out.println(naver4.id);
	      System.out.println(naver5.id);
	      System.out.println(naver6.id);
	   }
	}
}
