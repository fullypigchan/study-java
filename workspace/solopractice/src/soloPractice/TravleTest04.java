package soloPractice;

import java.util.Scanner;

public class TravleTest04 {

	public static void main(String[] args) {
		
		String question = "Q. 가장 가고싶은 여행지를 선택하세요.\n 1.바다\n 2.산\n 3.도시\n 4.시골";
		String information = "성격검사를 시작하겠습니다";
		String oceanMessage="바다: 자유롭고 감성이 풍부하며 새로운 것을 즐기는 성향입니다.";
		String mountainMessage="산: 차분하고 깊은 생각을 좋아하며 인내심이 강합니다.";
		String cityMessage="도시: 활동적이고 트렌디하며 자극을 좋아하는 성격입니다.";
		String countrysideMessage="시골: 평온함을 추구하고 따뜻한 정과 여유를 즐기는 성격입니다.";
		int insertMessage=0;
		String errorMessage="잘못된 값을 입력하셨습니다.";
		boolean oceanCondition = false;
		boolean mountainCondition = false;
		boolean cityCondition = false;
		boolean countrysideCondition = false;
		String result = null;
		Scanner sc= new Scanner(System.in);
		
		System.out.println(information);
		System.out.println(question);
		
		insertMessage=Integer.parseInt(sc.next());
		//여기서 실수함. 밑에 조건문 아래에 적었을 때 전부 에레메세지 뜸.
		
		oceanCondition=insertMessage==1;
		mountainCondition=insertMessage==2;
		cityCondition=insertMessage==3;
		countrysideCondition=insertMessage==4;

		
	
		
		result= oceanCondition? oceanMessage:mountainCondition?mountainMessage:
			cityCondition?cityMessage:countrysideCondition?countrysideMessage:
				errorMessage;
		System.out.println(result);
		sc.close();
		
		
	
	
	}

}
