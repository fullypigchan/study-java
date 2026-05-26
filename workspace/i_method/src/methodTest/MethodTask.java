package methodTest;

public class MethodTask {
   

//	//   1 ~ 10까지 println()으로 출력하는 메소드
//   void print1To10(){
//      for (int i = 0; i < 10; i++) {
//         System.out.println(i + 1);
//      }
//   }
//
//   
//   //   "홍길동"을 n번 println()으로 출력하는 메소드
//   void printHong(int n){
//      for (int i = 0; i < n; i++) {
//         System.out.println("홍길동");
//      }
//   }
   

//   
//   //   이름을 n번 println()으로 출력하는 메소드
//   void printName(String name, int n){
//      for (int i = 0; i < n; i++) {
//         System.out.println(name);
//      }
//   }
//   
//
//   
//   //   세 정수의 뺄셈 메소드
//   int subtract(int number1, int number2, int number3) {
//      return number1 - number2 - number3;
//   }
//   

   
   
//   //   1 ~ n까지의 합을 구해주는 메소드
//   int getTotalFrom1(int end) {
//      int result = 0;
//      for (int i = 0; i < end; i++) {
//         result += i + 1;
//      }
//      
//      return result;
//   }
//   
//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구해주는 메소드
//   주소값은 중복이 되지 않음. 주소는 첫번째 주소지를 저장하고 +1 +2이런 식으로 값을 찾아내는데
//   값을 바꾸려고 할때 그 주소를 찾아가 직접 값을 변경한 경우에 return할 필요가 없어진다.
//   매개 변수로 배열 주소지를 넣어준다.
//   두 정수를 위한 매개변수 두 개와, 나머지와 몫을 담을 배열.
//   void divide(int number1, int number2, int[] arResult) {
//     //분모에 0이 오면 안되니 if로 제외
//	   if(number2 != 0) {
//		   //리턴값은 하나이므로 배열에 몫과 나머지를 담는다.
//         arResult[0] = number1 / number2;
//         arResult[1] = number1 % number2;
//      }
//   }
// 
   
   
   

//   //   1 ~ 100을 입력받고 짝수만 리턴하는 메소드
////   리턴값 자료형이 정수헝 배열이다. 1~100을 입력 받아야하므로 매개변수는 정수형 배열
//   int[] getEven(int[] arData){
////     1~100중 짝수는 50개이므로 50크기의 짝수 배열 생성
//	  int[] arEven = new int[50];
////      for문을 이용해 짝수형 배열안에 1~100안에 짝수만 넣는다
////	  i=0 1 2...
////	    1 2 3...  i가 홀수일때 짝수이므로 i*2 +1을 해주면 1번째 3번째.. 홀수번째 배열의 값이 들어감.
//	  for (int i = 0; i < arEven.length; i++) {
//         arEven[i] = arData[i * 2 + 1];
//      }
////	  짝수 배열을 출력 해야하므로 arEven 리턴
//      return arEven;
//   }
//  
//   
   
   
   

   //   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//		5개의 정수를 입력 받는 배열, 최댓값 최솟값을 담을 배열 하나 매개변수로 설정
//   void getMaxAndMin(int[] arData, int[] arResult) {
////	 	arResult의 0번 방에 최댓값, arResult의 1번방을 최솟값으로 설정
//	   arResult[0] = arData[0];  //최댓값
//      arResult[1] = arData[0];  //최솟값
//      //총 5개의 정수이지만 arData의 0번 값을 초기값으로 나머지 4개의 숫자 비교.
//      for (int i = 1; i < arData.length; i++) {
//         if(arResult[0] < arData[i]) {
//            arResult[0] = arData[i];
//         }
//         if(arResult[1] > arData[i]) {
//            arResult[1] = arData[i];
//         }
//      }
//   }
//   

   
   
   //   void change(int[] data) {
//      data[0] = 10;
//   }
   
   
//	주문한 상품의 개수와 개별 가격, 할인 쿠폰으로 총 주문 가격을 구하는 메소드
//	pay(3,3000,1000)==8000
   

   
   
   
//	주문한 상품의 개수와 개별 가격, 할인 쿠폰으로 총 주문 가격을 구하는 메소드
//	단, 할인 쿠폰은 여러개 받을 수 있으며, 순차 적용하여 총 가격이 0이되지 않도록 적용한다.
//	pay(3,3000,new int[]{3000,4000,5000}) ==2000
   
   
   
//   문자열과 문자를 입력받고 문자가 몇 개 있는지 구하기
//   입력 예)banana, a 바나나에 a가 몇 개 있나!
//   출력 예)3
   int getCount(String str, char c) {
	   int count=0;
	   for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)==c) {
			count++;
		}
	}
	   return count;
   }
 
   
   
   public static void main(String[] args) {
      MethodTask m = new MethodTask(); //생성자 호출
//      int[] data = {20};
//      m.change(data);
//      
//      System.out.println(data[0]);
      

      
//      m.print1To10();

      
//      m.printHong(10);

      
//      m.printName("한동석", 10);

      
      
//      int result = m.subtract(1, 2, 3);
//      System.out.println(result);

      
      
      
//      int result = m.getTotalFrom1(100);
//      System.out.println(result);
      

      
      
//      int[] arResult = new int[2];
//      m.divide(10, 3, arResult);      
//      System.out.println(arResult[0]);
//      System.out.println(arResult[1]);
      
     
      
      
//      1부터 100을 담을 arData 배열 생성
//      짝수만 담기 위한 arEven 배열 생성
//      int[] arData = new int[100];
//      int[] arEven = null;
////    for문을 이용해 1부터 100을 arData라는 배열에 담기 
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//      }
////    메소드에서 리턴된 arEven값 arData의 주소를 가져옴.
//      arEven = m.getEven(arData);
////      for문을 이용하여 1~100사이 짝수 출력
//      for (int i = 0; i < arEven.length; i++) {
//         System.out.println(arEven[i]);
//      }
//      

      

      
//      int[] arData = {3, 5, 2, 1, 7};
//      int[] arResult = new int[2];
//      m.getMaxAndMin(arData, arResult);
//      
//      System.out.println(arResult[0]);
//      System.out.println(arResult[1]);
      
      
      
     int result= m.getCount("banna", 'a');
     System.out.println(result);
      
      
      
      
      
   }
}












