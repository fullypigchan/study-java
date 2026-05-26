package anonymousTest;

public class Road 
{
   public static void main(String[] args) {
//      잠실점 오픈
//      잠실점은 무료 나눔 행사중
//      메뉴는 있으나 판매방식은 없다.
      
//	   [실습]
//			   나이키 회사를 설립한다.
//
//			   강남점은 일반 판매를 진행하는 지점이고,
//			   잠실점은 무료 나눔 행사를 진행하는 지점이다.
//
//			   지점을 새로 오픈하면, 본사에 정해진 양식에 맞춰 최초 1회 등록해야한다.
//
//			   무료 나눔 행사중이라면, "무료 나눔 행사" 출력
//			   일반 판매중이라면, 판매를 직접 해본다(sell() 사용).
//
//			   무료 나눔 행사중인 지점은 판매 방식을 등록할 필요 없다.
      Nike gangnam = new Nike();
      
      gangnam.register(new Form() {
         
         @Override
         public void sell(String order) {
            for (int i = 0; i < getMenu().length; i++) {
               if(getMenu()[i].equals(order)) {
                  System.out.println(order + " 판매 완료");
               }
            }            
         }         
         @Override
         public String[] getMenu() {
            return new String[] {"축구공", "농구공", "운동화", "축구화"};
         }
      });
      
      
      Nike jamsil = new Nike();
      jamsil.register(new FormAdapter() {
    	  @Override
    	  public String[] getMenu() {
              return new String[] {"축구공", "농구공", "운동화", "축구화"};
    	}
      });
   }
}



