package anonymousTest;

/**
 * Form 인터페이스 (규격)
 *
 * - 본사(Nike)는 지점이 이 규격을 따라야만 등록(register)할 수 있다고 가정한다.
 * - getMenu(): 이 지점이 제공하는 메뉴(상품 목록)를 문자열 배열로 반환한다.
 * - sell(order): 본사에서 "이 상품을 팔아봐"라고 요청했을 때 지점이 수행할 동작.
 *
 * 인터페이스는 '무엇을 할 수 있는지'만 정의(메서드 이름과 파라미터)
 * 실제 구현(어떻게 할지)은 각 지점(클래스)이 담당한다.
 */
public interface Form1 {
   public String[] getMenu();      // 이 지점의 메뉴(상품 목록)를 알려달라는 약속
   public void sell(String order); // 본사가 "이 상품을 팔아봐"라고 요청하면 이 메서드를 호출
}
