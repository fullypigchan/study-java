package anonymousTest;

/**
 * Road: 프로그램 실행 진입점
 *
 * - 강남점: 익명 클래스(즉석에서 Form 인터페이스를 구현) — 실제 판매 동작을 구현
 * - 잠실점: AbstractFormAdapter(추상 어댑터)를 상속한 익명 클래스 — 메뉴 없음, 판매 안 함
 *
 * 익명 클래스 사용 이유:
 * - 간단한 구현을 별도의 파일로 만들지 않고 바로 쓰고 싶을 때 편리하다.
 */
public class Road1 {
   public static void main(String[] args) {

      Nike1 nike = new Nike1(); // 본사 객체 생성

      // ============================
      // 강남점 (익명 클래스 - 실제 판매)
      // ============================
      // 'new Form() { ... }'은 Form 인터페이스를 바로 구현한 익명 클래스(이름 없음)이다.
      // getMenu(), sell()을 직접 구현해서 '판매 가능한 지점'을 만든다.
      nike.register(new Form1() {

         @Override
         public String[] getMenu() {
            // 강남점의 메뉴를 배열로 반환
            return new String[] {"축구공", "농구공", "운동화", "축구화"};
         }

         @Override
         public void sell(String order) {
            // 본사가 보낸 order(주문)를 메뉴와 비교해서 있으면 판매 완료 출력
            for (int i = 0; i < getMenu().length; i++) {
               if (getMenu()[i].equals(order)) {
                  System.out.println(order + " 판매 완료");
                  return; // 판매되면 더 이상 확인하지 않음
               }
            }
            // 메뉴에 없으면 해당 메시지 출력
            System.out.println(order + " 메뉴에 없습니다.");
         }
      });

      // ============================
      // 잠실점 (익명 클래스 + 추상 어댑터)
      // ============================
      System.out.println("===== 잠실점 오픈 =====");

      // 아래는 AbstractFormAdapter(기본 동작 제공)를 상속한 익명 클래스이다.
      // 추상 어댑터는 기본적으로 메뉴가 빈 배열이고 sell()은 "판매 기능 없음" 메시지를 출력한다.
      // 여기서는 잠실점 특성상 판매를 하지 않으므로 sell()만 잠실점 전용 메시지로 덮어쓴다.
      nike.register(new AbstractFormAdapter() {

         // 익명 클래스의 초기화 블록: 객체 생성 시 한 번 실행되는 코드를 넣을 수 있다.
         // 생성자처럼 동작하지만, 익명 클래스는 이름이 없기 때문에 초기화 블록으로 상태 출력 사용.
         {
            System.out.println("잠실점 오픈 - 현재 무료 나눔 행사중");
         }

         // 메뉴가 없으므로 getMenu()를 오버라이드 하지 않아도 기본(빈 배열)이 사용된다.

         @Override
         public void sell(String order) {
            // 잠실점은 판매를 하지 않으므로, 본사가 sell()을 호출해도 판매가 일어나지 않는다.
            // 대신 잠실점 상황에 맞는 메시지를 출력한다.
            System.out.println("현재 무료 나눔 행사중이라 판매를 진행하지 않습니다.");
         }
      });

   }
}
