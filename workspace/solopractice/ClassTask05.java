package classTask;
//화면
//부서별 매출관리

//회사 클래스
//회사 번호
//부서 이름
//부서 매출

//회사 1개당 여러 부서가 있다.
//회사는 부서별 총 매출과 평균 매출을 구할 수 있다.
//Company.java, Department.java
public class ClassTask05 {
	public static void main(String[] args) {
	//화면	
		
		Department arDepartment[] = {
				new Department("인사과",300),
				new Department("회계과",500),
				new Department("업무과",200)
		};
		Company samsung=new Company(arDepartment);
		System.out.println(samsung.total);
		System.out.println(samsung.avg);
	}
}
