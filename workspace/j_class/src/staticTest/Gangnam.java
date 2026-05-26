package staticTest;

public class Gangnam {
public static void main(String[] args) {
	Company 한동석=new Company("한동석",1000);
	Company 김민환=new Company("김민환",3000);
	
	Company.totalIncome += 한동석.income; //static은 클래스로 접근한다. 객체로 접근할 필요 없다.
	Company.totalIncome += 김민환.income;
	
	System.out.println(Company.totalIncome);
	
}
}
