package soloPractice;
//게시글(Post)
//번호
//제목
//내용

public class Post {

	int postNum;
	String title;
	String titleMessage;
	Reply[] arrReply;
	int total;
	
	public Post() {;}

	public Post(int postNum, String title, String titleMessage, Reply[] arrReply) {
		this.postNum = postNum;
		this.title = title;
		this.titleMessage = titleMessage;
		this.arrReply = arrReply;
		for (int i = 0; i < arrReply.length; i++) {
			total=arrReply.length;
		}
	}
	
	
}
