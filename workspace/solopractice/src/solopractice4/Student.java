package solopractice4;

import java.util.Objects;

//학번(id) — 중복 없음
//
//이름(name)
//
//국어 점수(kor)
//
//영어 점수(eng)
//
//수학 점수(math)
public class Student {
	private  int id;
	private String name;
	private int kor;
	private int eng;
	private int math;
public Student() {;}
public Student(int id, String name, int kor, int eng, int math) {
	super();
	this.id = id;
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getKor() {
	return kor;
}
public void setKor(int kor) {
	this.kor = kor;
}
public int getEng() {
	return eng;
}
public void setEng(int eng) {
	this.eng = eng;
}
public int getMath() {
	return math;
}
public void setMath(int math) {
	this.math = math;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
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
	Student other = (Student) obj;
	return id == other.id;
}
 
}
