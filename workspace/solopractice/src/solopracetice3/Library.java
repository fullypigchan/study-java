package solopracetice3;

import java.util.List;

public class Library {
	public Library() {
		;
	}

//Library 클래스에 다음 기능을 구현하시오.
//
//① 도서 추가
//
//인자로 받은 Book 객체를 저장소에 추가한다.
	public void add(Book books) {
		LibraryDB.books.add(books);
	}

//
//② 도서 삭제
//
//삭제할 도서의 "제목(title)"을 받아서 해당 책을 삭제한다.
	public void delete(String title) {
		for (int i = 0; i < LibraryDB.books.size(); i++) {
			if (LibraryDB.books.get(i).getTitle().equals(title)) {
				LibraryDB.books.remove(i);
			}
		}
	}

//③ 평균 가격보다 저렴한지 검사
//
//인자로 가격(price)을 전달받아
//현재 저장된 모든 도서의 평균 가격보다 낮으면 true,
//아니면 false를 반환한다.
	public boolean checkPrice(int price) {
		int total = 0;
		double average = 0.0;
		for (int i = 0; i < LibraryDB.books.size(); i++) {
			total += LibraryDB.books.get(i).getPrice();
		}
		average = (double) total / LibraryDB.books.size();
		return price < average;
	}

//④ 모든 도서 조회
//
//저장된 모든 Book 객체를 리스트 형태로 반환한다.
	public List<Book> findAll() {
		return LibraryDB.books;
	}

//⑤ 제목으로 가격 조회
//
//도서 제목을 전달받아 해당하는 Book의 가격을 반환한다.
//
//해당 제목의 책이 없으면 -1을 반환한다.
	public int findPriceByName(String title) {
		for (int i = 0; i < LibraryDB.books.size(); i++) {
			if (LibraryDB.books.get(i).getTitle().equals(title)) {

				return LibraryDB.books.get(i).getPrice();
			}
		}
		return -1;
	}

}
