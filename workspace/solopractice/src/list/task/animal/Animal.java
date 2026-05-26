package list.task.animal;

import java.util.Objects;

//보호 번호(id) — 중복 없음
//
//이름(name)
//
//나이(age)
//
//종류(type) — 예: 강아지, 고양이, 토끼 등
public class Animal {

	private long id;
	private String name;
	private int age;
	private String type;

	public Animal() {
	}

	public Animal(Animal animal) {
		this(animal.getId(), animal.getName(), animal.getAge(), animal.getType());
	}

	public Animal(long id, String name, int age, String type) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", age=" + age + ", type=" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return id == other.id;
	}

}
