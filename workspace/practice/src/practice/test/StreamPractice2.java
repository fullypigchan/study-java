package practice.test;

import java.util.ArrayList;
import java.util.List;

enum Department {
    DEV,    // 개발팀
    DESIGN, // 디자인팀
    SALES,  // 영업팀
    HR      // 인사팀
}

class Employee {
    private String name;
    private Department dept;
    private int workYear; // 근속 연수
    private int salary;   // 연봉 (단위: 만원)

    public Employee(String name, Department dept, int workYear, int salary) {
        this.name = name;
        this.dept = dept;
        this.workYear = workYear;
        this.salary = salary;
    }

    public String getName() { return name; }
    public Department getDept() { return dept; }
    public int getWorkYear() { return workYear; }
    public int getSalary() { return salary; }
}

public class StreamPractice2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("김자바", Department.DEV, 3, 5000));
        employees.add(new Employee("이스프", Department.DEV, 7, 7000)); // 대상 (5년 이상)
        employees.add(new Employee("박디비", Department.DEV, 12, 9000)); // 대상 (10년 이상 - 보너스율 다름)
        employees.add(new Employee("최디자", Department.DESIGN, 8, 6000));
        employees.add(new Employee("정영업", Department.SALES, 10, 8000));
        employees.add(new Employee("한클라", Department.DEV, 5, 5500));  // 대상 (5년 이상)

        System.out.println("=== 개발팀 시니어 보너스 명세서 ===");

        // TODO: 아래 요구사항을 Stream API로 구현하세요.
        // 코드를 작성해 주세요.
        employees.stream().filter((employee)->employee.getDept()==Department.DEV
        		&& employee.getWorkYear()>=5).map((employee)->
        		{
        			double bonusRate;
        			if(employee.getWorkYear()>=10) {
        				bonusRate=0.2;
        			}else {
        				bonusRate=0.1;
        			}
        		int bonusResult = (int) (employee.getSalary()*bonusRate);
        		
        		return String.format("%s님 보너스 확정: %d만원 (근속 %d년)",
        				employee.getName(),bonusResult,employee.getWorkYear());
        		}).forEach(System.out::println);

//        	데이터 변환 (map):
//
//        	사원 객체를 **보너스 지급 내역 문자열(String)**로 변환합니다.
//
//        	💰 보너스 계산 로직 (비즈니스 로직):
//
//        	근속 연수가 10년 이상인 경우: 연봉의 20%
//
//        	그 외 (5년~9년): 연봉의 10%
//
//        	반환 형식: "[이름]님 보너스 확정: [금액]만원 (근속 [연수]년)" (금액은 정수형으로 처리)
//
//        	후처리 (forEach):
//
//        	변환된 메시지를 콘솔에 출력하세요.
    }
}