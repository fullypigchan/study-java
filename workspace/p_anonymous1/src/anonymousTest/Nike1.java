package anonymousTest;

/**
 * Nike 본사 클래스
 *
 * - register(Form form): 본사가 지점을 등록하면서
 *   1) 메뉴를 출력하고
 *   2) 예시로 두 개의 상품("축구공", "축구화")을 팔아보라고 지점에 요청한다.
 *
 * 본사는 지점이 정확히 Form 규격을 따르기만 하면 내부 동작(구현 방식)은 신경 쓰지 않는다.
 */
public class Nike1 {
   public void register(Form1 form) {

      // [메뉴 출력]
      // form.getMenu()를 호출하여 지점의 메뉴를 받아온다.
      // getMenu()가 빈 배열이면 출력은 아무것도 안 된다.
      System.out.println("[메뉴 출력]");
      for (int i = 0; i < form.getMenu().length; i++) {
         System.out.println(form.getMenu()[i]);
      }	

      // [판매 테스트]
      // 본사는 테스트용으로 두 상품을 주문한다.
      // 지점이 판매를 처리하도록 sell()을 호출한다.
      System.out.println("[판매 테스트]");
      form.sell("축구공");
      form.sell("축구화");

      System.out.println(); // 보기 좋게 줄바꿈
   }
}
