package stringTest;

public class StringTest {
public static void main(String[] args) {

//	String 초기값은 ""이 아니라 null이다.
//	선언 후 문자열 연결을 사용하지 않으면 null로 초기화한다.
//
//	선언 후 문자열 연결을 사용하고자 한다면, ""(빈 문자열)로 초기화한다.
//		String data="";  
//		data+="안녕하세요";  --> 안녕하세요 출력됨
//	
//		String data=null;
//		data=data+"안녕하세요"; --->출력시 null안녕하세요
//		String은 클래스, 문자배열 char value[]

//	String data="ABC";
	
//	System.out.println(data.length());
//	System.out.println(data.charAt(0));
//	System.out.println(data.indexOf("A")); //만일 없는 문자를 쓰면 -1 출력됨
	
//	String data="CABC";
//	System.out.println(data.indexOf("C"));     //왼쪽에서 오른쪽으로
//	System.out.println(data.lastIndexOf("C")); //오른쪽에서부터 왼쪽으로
//	System.out.println(data.contains("C")); //커서를 댔을때 맨앞에 리턴타입이다.
//	System.out.println(data.substring(1)); 	//begin부터 출력
//	System.out.println(data.substring(2,3)); //begin부터 ,end는 출력 안됨
//	System.out.println(data.replace('A','Z'));  //단일문자를 바꿀 땐 replace
//	System.out.println(data.replaceAll("AB", "LORI"));	//문자열을 바꿀 땐(붙어있는 문자열) replaceAll
//	
//	문자열 값 비교
//	String data1="ABC";
//    String data2=new String("ABC");
//    System.out.println(data1.equals(data2));
    
//    구분점으로 문자열 분리
	String data="1,2,3,4,5";
	
//	5칸 배열로 만들고 싶다.
//	String[] arData=data.split(",");
//	for (int i = 0; i < arData.length; i++) {
//		System.out.print(arData[i]);
//	}
	
//  String data = "가 나 다 라 마 바 사";
//  String[] arData = data.split(" ");
//  
//  for (int i = 0; i < arData.length; i++) {
//     System.out.println(arData[i]);
//  }
  
//  String url = "www.naver.com/news";
//  String[] arData = url.split("/");
//  String target = arData[arData.length - 1];
//  
//  if(target.equals("news")) {
////     뉴스 페이지로 이동
//  }
  
}
}
