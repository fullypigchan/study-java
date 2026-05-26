package list.task.food;

import java.util.ArrayList;
import java.util.List;

import list.task.DBConnecter;

//- 음식 추가
//- 음식 이름으로 음식 종류 조회
//- 사용자가 원하는 종류의 음식 전체 조회
//- 음식 종류 수정 후 가격 10% 상승
//- 사용자가 원하는 종류의 음식 개수 조회
public class Restaurant {

	public Restaurant() {
	}

	public void add(Food food) {
		DBConnecter.foods.add(new Food(food));
	}

	public String findTypeByName(String name) {
		for (int i = 0; i < DBConnecter.foods.size(); i++) {
			Food food = DBConnecter.foods.get(i);
			if (DBConnecter.foods.get(i).getName().equals(name)) {
				return food.getType();
			}
		}
		return null;
	}

	public List<Food> findFoodByType(String type) {
		List<Food> result = new ArrayList<Food>();
		for (int i = 0; i < DBConnecter.foods.size(); i++) {
			if (DBConnecter.foods.get(i).getType().equals(type)) {
				result.add(new Food(DBConnecter.foods.get(i)));
			}
		}
		return result;
	}

	public void setTypeAnd10Price(Food food) {
		food.setPrice((int) (food.getPrice() * 1.1));
		for (int i = 0; i < DBConnecter.foods.size(); i++) {
			if (DBConnecter.foods.get(i).getName().equals(food.getName())) {
				DBConnecter.foods.set(i, new Food(food));
			}
		}
	}

	public int findAllFoodByType(String type) {
		int count = 0;
		for (int i = 0; i < DBConnecter.foods.size(); i++) {
			if (DBConnecter.foods.get(i).getType().equals(type)) {
				count++;
			}
		}
		return count;
	}
}
