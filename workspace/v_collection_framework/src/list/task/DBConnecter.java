package list.task;

import java.util.ArrayList;

import list.task.food.Food;
import list.task.fruit.Fruit;
import list.task.product.Product;
import list.task.user.User;

//[실습 1]
//list.task.fruit
//
//과일 정보를 담을 클래스 선언(Fruit)
//   - 과일 이름(중복 없음)
//   - 과일 가격
//
//CRUD관련 기능을 담아놓을 클래스 선언(Market)
//   - 과일 추가
//   - 과일 삭제
//   - 과일 가격이 평균 가격보다 낮은 지 검사
//   - 과일 전체 조회
//   - 과일 이름으로 가격 조회

public class DBConnecter {
	private DBConnecter() {
		;
	}

//스태틱은 new안해도 사용 가능하다!
	public static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	public static ArrayList<Food> foods = new ArrayList<Food>();
	public static ArrayList<User> users = new ArrayList<User>();
	
}
