package list.task.food;

public class FoodMainTest {
	public static void main(String[] args) {

		Food food = new Food("공기밥", 1000, "한식");
		Food food2 = new Food("순대국", 11000, "한식");
		Food food3 = new Food("파스타", 13000, "양식");
		Restaurant restaurant = new Restaurant();

		restaurant.add(food);
		restaurant.add(food2);
		restaurant.add(food3);
		System.out.println(food);

	}
}
