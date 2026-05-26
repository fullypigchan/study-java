package file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilTest {
	public static void main(String[] args) throws IOException {
//		절대 경로
//		D:\gb_0900_kyc\java\memo

//		상대 경로
//		./, ../등

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./test.txt", true));
//		뒤에 true를 붙여주면 이어쓰기, 안쓰면 덮어쓰기

		bufferedWriter.write("잡채\n"); // buffer에 담기기만 한 것임. -> flush 해줘야함. .close()
		bufferedWriter.write("볶음밥\n");
		bufferedWriter.close();
		BufferedReader bufferedReader = null;
		try {

			String line = null;
			bufferedReader = new BufferedReader(new FileReader("./test.txt"));

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		bufferedReader.close();
	}
}
