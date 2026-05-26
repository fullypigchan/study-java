package stringTest;

public class StringTask {
public static void main(String[] args) {
//1.	아래의 주소에서"/samsung"만 분리하여 출력한다.
//	www.naver.com/baseball/samsung
	
// 2. 아래의 주소들을 배열에 담고, 마지막 경로가 samsung인 것만 출력한다.
//  www.naver.com/baseball/lg  -0
//  www.naver.com/phone/samsung -1
//  www.naver.com/baseball/lotte -2
//  www.naver.com/baseball/kt    -3
//  www.naver.com/baseball/samsung -4
  
//  1.
//	String url1="www.naver.com/baseball/samsung";
//	 /도 출력해야하므로 마지막 /가 있는 index 번호를 선언
//	int targetIndex=url1.lastIndexOf("/");
//	substring 메소드를 이용하여 targetIndex부터 출력
//	String target = url1.substring(targetIndex);
//	System.out.println(target);
//	2.
	String[] arData=  {"www.naver.com/baseball/lg","www.naver.com/phone/samsung",
			"www.naver.com/baseball/lotte","www.naver.com/baseball/kt",
			"www.naver.com/baseball/samsung"};
//	arData 반복문 돌리기
	for (int i = 0; i < arData.length; i++) {
//		arData안에 있는 값 중 /를 구분점으로 분리한 배열 생성
		String[] arUrl=arData[i].split("/");
//		그 중 마지막 자리만 알아내면 되므로 배열 길이에서 1빼
		String target=arUrl[arUrl.length-1];
//		마지막 인덱스 자리 값이 samsung인 값만 출력
		if(target.equals("samsung")) {
			System.out.println(arData[i]);
		}
	}
			
}
}
