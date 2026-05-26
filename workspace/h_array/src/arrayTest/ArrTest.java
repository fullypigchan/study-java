package arrayTest;

public class ArrTest {

	public static void main(String[] args) {
	
		
		int[][] arrData= {{3,4,5},{7,8,9}};
		int rowLength =arrData.length;
		int colLength = arrData[0].length;
		int length=rowLength*colLength;
//		i=0 1 2 3 4 5 
//		[0][0],[0][1],[0][2] 
//		[1][0],[1][1],[1][2]
//		행 000111
//		열 012012
//		for (int i = 0; i < length; i++) {
//			System.out.println(arrData[i /3 ][i%3]);
//		}
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.println(arrData[i][j]);
			}
			
		}
		
	}

}
