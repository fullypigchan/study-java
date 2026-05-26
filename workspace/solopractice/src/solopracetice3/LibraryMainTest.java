package solopracetice3;

//Library 객체 생성
//
//도서 3권 이상 추가
//
//도서 전체 출력
//
//특정 제목의 가격 조회
//
//임의의 가격이 평균보다 낮은지 확인
//
//한 도서를 삭제한 후 다시 전체 조회
public class LibraryMainTest {
	public static void main(String[] args) {
		Library lib = new Library();
		lib.add(new Book("홍길동전", "허균", 9000));
		lib.add(new Book("이방인", "알베르 카뮈", 12000));
		lib.add(new Book("맹신자들", "호퍼", 15000));
		System.out.println("도서 전체 출력:");
		System.out.println();
		for (int i = 0; i < LibraryDB.books.size(); i++) {
			System.out.println(lib.findAll());
		}
		System.out.println(lib.findPriceByName("이방인"));
		System.out.println(lib.checkPrice(6000));
		
		lib.delete("맹신자들");
		System.out.println(lib.findAll());
	}
}
