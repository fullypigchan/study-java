package objectTest;

import java.util.Random;

public class HashCodeTest {
	public static void main(String[] args) {

		Random r = new Random();
		System.out.println(r);
		// java.util.Random@515f550a 는 해시코드 주소값이다. 실제 하드웨어 안 주소 아님.
	}
}
