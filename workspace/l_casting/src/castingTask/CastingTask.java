package castingTask;
//아래의 getService 메소드로 1개의 영상을 전달 받은 뒤
//애니메이션과 영화일 경우에만 각 서비스를 사용한다
//반드시 up casting과 down casting을 활용한다.
//Film, Animation, Drama중 어떤 영상이 들어올지 알 수 없다.
public class CastingTask {
	//뭐가 들어올지 모르므로 비디오 넣는다(업캐스팅)
	public void getService(Video video) {
			
		if(video instanceof Animation) {
			
			Animation animation=(Animation) video;
			animation.printSubtitle();
				
			}else if(video instanceof Animation) {
				
				Film film = (Film) video;
				film.shake();
				
			}else
			
				System.out.println("지원되지 않는 서비스입니다.");
	}	
	
	
	
	
	public static void main(String[] args) {
		
		CastingTask castingTask=new CastingTask();
		
		Video[] arVideo = {
				new Animation(),
				new Film(),
				new Drama()
		};
		
		for (int i = 0; i < arVideo.length; i++) {
			castingTask.getService(arVideo[i]);
		}
		
		
	}
}
