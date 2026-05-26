package anonymousTest;

/**
 * 추상 어댑터(AbstractFormAdapter)
 *
 * - Form 규격을 구현하되, 기본 동작을 미리 제공한다.
 * - 예) 메뉴가 없는 지점은 getMenu()가 빈 배열을 반환하도록 기본 제공.
 * - 판매 기능을 기본적으로 "판매 불가"로 설정해 둔다.
 *
 * 장점: 지점들은 필요한 부분만 덮어쓰면 된다(override).
 */
public abstract class AbstractFormAdapter implements Form1 {

   // 기본 구현: 메뉴가 없으면 빈 배열을 반환하도록 해두었다.
   // 이렇게 하면 getMenu()를 아예 구현하지 않아도 NullPointerException 안 남.
   @Override
   public String[] getMenu() {
      return new String[] {}; // 메뉴가 없음을 의미 (빈 목록)
   }

   // 기본 구현: 판매 기능이 없다는 메시지를 출력한다.
   // 실제로 판매를 하는 지점은 이 메서드를 덮어써서(override) 판매 동작을 구현하면 된다.
   @Override
   public void sell(String order) {
   }
}
//추상 클래스를 상속하면 필요 없는 동작은 그대로 쓰고, 필요한 동작만 바꿀 수 있다.