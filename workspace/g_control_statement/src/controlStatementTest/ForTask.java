package controlStatementTest;

import java.util.Scanner;

public class ForTask {

	public static void main(String[] args) {
//		반복의 핵심은 반복횟수 최소화이다.
//		1~100 출력(100번 반복)
//		100~1 출력(100번 반복)
//		1~100까지 중 짝수만 출력(50번 반복)
//		for(int i=0; i<100; i++) {
//			System.out.println(i+1);
//		}
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		
//		for(int i=0; i<100; i++) {
//			System.out.println(100-i);
//		}
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		
//		for(int i=0; i<50; i++) {
//			System.out.println(i*2 +2);
//		}
////		모듈러스(%): 나머지 연산자
////		10 % 3 == 1
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//				for(int i = 0; i < 50; i++) {
//			if(i % 2 ==1) {
//				System.out.println(i+1);
//			}
//		}
//		1~10까지 합 출력(10번 반복)
//		1~n까지 합 출력(n은 사용자에게 입력받는다)
//		int sum= 0;
//		for(int i=0; i<10; i++) {
//     
//		sum += i + 1;
////    1: sum = 0 + 1
////    2: sum = (0 + 1) + 2
////    3: sum = (0 + 1 + 2) + 3
////    4: sum = (0 + 1 + 2 + 3) + 4
////    10: sum = 55	
//		
//		sum=sum+i+1
//			sum += i+1;
//		}
//		System.out.println(sum); //출력을 for문 밖에 해야 마지막 값만 출력
//	}
//		Scanner sc=new Scanner(System.in);
//		int end=0;, total=0;
//		  String message = "1~n까지의 합: ";
//	      
//	      System.out.print(message);
//	      end = sc.nextInt();
//	      
//	      for(int i = 0; i < end; i++) {
//	         total += i + 1;
//	      }
//	      
//	      System.out.println(total);

//	0 1 2 3 0 1 2 3 0 1 2 3 출력 ->반복횟수 12
//	0 1 2 3 4 5 6 7 8 9 10 11	
//		x를 n으로 나눈 나머지 범위: 0~n-1
	for(int i=0; i<12; i++) {
				
			System.out.print(i%4 + " ");
	
		
	}
}
}