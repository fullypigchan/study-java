package arrayList.test;

import java.util.Objects;

//int id : 학번
//String name : 이름
//int score : 점수
//int grade : 학년 (1~4)
public class Student02 {

	private long id;
	private String name;
	private int score;
	private int grage;

	public Student02() {
	}

	public Student02(long id, String name, int score, int grage) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.grage = grage;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getGrage() {
		return grage;
	}

	public void setGrage(int grage) {
		this.grage = grage;
	}

	@Override
	public String toString() {
		return "Student02 [id=" + id + ", name=" + name + ", score=" + score + ", grage=" + grage + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student02 other = (Student02) obj;
		return id == other.id;
	}
}
