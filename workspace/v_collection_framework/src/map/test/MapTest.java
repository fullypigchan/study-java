package map.test;

import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> caffe = new HashMap<String, Integer>();

		caffe.put("아메리카노", 3000);
		caffe.put("카페라떼", 4000);
		caffe.put("아메리카노", 4000); // 새로운걸 넣어주면 값이 수정된다!

		System.out.println(caffe);
	}
}
