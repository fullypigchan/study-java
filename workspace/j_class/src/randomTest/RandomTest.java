package randomTest;

import java.util.Random;

public class RandomTest {
public static void main(String[] args) {
//	0~9 중 1개 난수 발생( n넣으면 n-1까지 나온다)
//	random.nextInt(10);
//	System.out.println(random.nextInt(10));
//	System.out.println(random.nextInt(10));
//	System.out.println(random.nextInt(10));
	
	Random random=new Random();
	String str = "abcdefghizklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	String code = "";
	  for (int i = 0; i < 10; i++) {
	         code += str.charAt(random.nextInt(str.length()));
	      }
	      
	      System.out.println(code);
}
}
