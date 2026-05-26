package file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//생선 종류를 작성한 뒤
//전체 생선 종류를 콘솔에 출력한다.
//생선은 최대 3개까지만 작성한다.
//파일 이름: fish.txt
//경로: ./
public class FileTask {
	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./fish.txt", true));

		bufferedWriter.write("참치\n");
		bufferedWriter.write("연어\n");
		bufferedWriter.write("방어\n");
		bufferedWriter.close();

		BufferedReader bufferedReader = null;
		bufferedReader = new BufferedReader(new FileReader("./fish.txt"));

		try {
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {// 최우선 연산자()안에 대입연산자.
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		bufferedReader.close(); // 꼭 write를 하거나 read를 한 후에는 close(flush 과정 포함)를 해줘야한다.
	}
}
