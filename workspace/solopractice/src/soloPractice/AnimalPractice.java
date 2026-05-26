package soloPractice;

import java.util.Scanner;


public class AnimalPractice {

	public static void main(String[] args) {
		
		String question = "Q. 당신이 가장 좋아하는 동물을 고르시오.\n 1.강아지\n 2.고양이\n 3.토끼\n 4.사자";
		String dogMessage ="강아지: 친근하고 사교적이며 주변을 잘 챙기는 성격입니다.";
		String catMessage ="고양이: 독립적이고 섬세하며 감성이 풍부한 성격입니다.";
		String rabbitMessage ="토끼: 순하고 부드럽고 배려심 많은 성격입니다.";
		String lionMessage ="사자: 리더십 있고 자신감 넘치며 결단력 있는 성격입니다.";
		String errorMessage="다시 입력하세요";
		int number = 0;
		String result=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println(question);
		number=sc.nextInt();
		
		result=number==1?dogMessage:number==2?catMessage:number==3
		?rabbitMessage:number==4?lionMessage:errorMessage;
		System.out.println(result);

		sc.close();
	}

}
