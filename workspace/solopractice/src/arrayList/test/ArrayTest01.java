package arrayList.test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayTest01 {
	public static void main(String[] args) {
//정수(Integer)를 저장할 수 있는 ArrayList를 만드세요.
//리스트에 10, 20, 30, 40, 50을 순서대로 추가하세요.
//반복문을 사용하여 리스트에 있는 모든 숫자의 합을 계산하고 출력하세요.
//추가로, 리스트에서 30을 삭제하고, 남은 리스트를 출력하세요.
//
//		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//		int total = 0; 
//		for (int i = 0; i < number.size(); i++) {
//				total +=number.get(i);
//		}
//		System.out.println(total);
//		number.remove(Integer.valueOf("30"));
//		System.out.println(number);
//		
//		다음 단어들을 ArrayList에 저장하세요: "Apple", "Banana", "Cherry", "Date", "Eggplant"
//
//		리스트를 순회하면서 길이가 5글자 이상인 단어만 찾아서 출력하세요.
//
//		리스트에 "Banana"가 포함되어 있는지 확인(contains)하고, 있다면 "바나나를 찾았습니다!"라고 출력하세요.

//		ArrayList<String> eng = new ArrayList<String>(Arrays.asList("Apple","Banna",
//				"Cherry","Data","Eggplant"));
//		for (int i = 0; i < eng.size(); i++) {
//			if(eng.get(i).length()>=5) {
//				System.out.println(eng.get(i));
//			}
//		}
//		for (int i = 0; i < eng.size(); i++) {
//			if(eng.get(i).contains("Banna")) {
//				System.out.println("바나나를 찾았습니다");
//			}
//		}

//		학생의 이름(String)과 점수(int)를 저장하는 Student 클래스를 만드세요.
//		ArrayList<Student>를 생성하고 학생 3명의 정보를 추가하세요.
//		예: ("철수", 85), ("영희", 92), ("민수", 70)
//		리스트를 순회하면서 점수가 80점 이상인 학생의 이름만 출랙력하세요.
//		모든 학생의 평균 점수를 계산하여 출력하세요.

//		ArrayList<Student> students = new ArrayList<Student>();
//		students.add(new Student("철수", 85));
//		students.add(new Student("영희", 92));
//		students.add(new Student("민수", 70));
//		double average = 0;
//		for (int i = 0; i < students.size(); i++) {
//			if (students.get(i).getAge() > 80) {
//				System.out.println(students.get(i).getName());
//			}
//		}
//		for (int i = 0; i < students.size(); i++) {
//			average += (double)students.get(i).getAge()/3;
//		}
//		System.out.println(average);

		ArrayList<Student02> students = new ArrayList<Student02>();
		int total = 0;
		students.add(new Student02(1001, "홍길동", 90, 2));
		students.add(new Student02(1002, "김철수", 90, 1));
		students.add(new Student02(1003, "이영희", 85, 3));
		students.add(new Student02(1004, "박민수", 90, 3));
		students.add(new Student02(1005, "최지우", 85, 2));
		students.add(new Student02(1006, "한유진", 95, 4));
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getGrage() == 3) {
				System.out.println(students.get(i));
			}
		}
		for (Student02 sum : students) {
			total += sum.getScore();
		}
		double average = (double) total / students.size();
		System.out.println(average);

		// 점수가 90점 이상인 학생 수를 구하시오
		Student02 topStudent = students.get(0);
		for (Student02 highScore : students) {
			if (highScore.getScore() > topStudent.getScore()) {
				topStudent = highScore;
			}
		}
		System.out.println(topStudent);

//			문제 4: 90점 이상 학생 수
		int count = 0;
		for (Student02 over90 : students) {
			if (over90.getScore() >= 90) {
				count++;
			}
		}
		System.out.println("90점 이상인 학생 수는: " + count);
//		
//		문제 5: 학년별 평균 점수
		int[] sum = new int[5]; // 인덱스 1~4 사용
		int[] cnt = new int[5];

		for (Student02 s : students) {
			int g = s.getGrage();
			sum[g] += s.getScore();
			cnt[g]++;
		}

		System.out.println("\n=== 학년별 평균 점수 ===");
		for (int i = 1; i <= 4; i++) {
			double avg = (cnt[i] == 0) ? 0 : (double) sum[i] / cnt[i];
			System.out.println(i + "학년 평균: " + avg);
		}
	}
}