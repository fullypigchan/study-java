package soloPractice;
//게시글과 댓글 정보를 받아서 추가한다.
//게시글에서는 댓글의 전체 개수를 계산할 수 있다.

//게시글(Post)
//번호
//제목
//내용

//댓글(Reply)
//번호
//내용
public class ClassTask08 {
public static void main(String[] args) {
	
	Reply[] arrReply = {
			new Reply(1, "재밋다"),
			new Reply(2, "난 별로임"),
			new Reply(3, "그만 싸워")
	};
	Post post1=new Post(1, "skt 우승", "쓰리핏 성공", arrReply);
		int result= post1.total;
	System.out.println("post1의 댓글 갯수는: ");
		System.out.println(result);
		}


}