package list.task.fruit;

import java.util.Objects;

public class Fruit {

	private String name;
	private int price;

	public Fruit() {
		;
	}

	public Fruit(Fruit fruit) {
		this(fruit.getName(),fruit.getPrice());
	}
	
	
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruits [name=" + name + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

}
