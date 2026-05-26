package lambdaTest;

public class LambdaTest {

	public static void main(String[] args) {

//		LambdaInter lambdaInter = new LambdaInter() {
			
//			@Override
//			public boolean checkMultipleOf10(int number) {
//				return number %10 ==0;
//			}
//		};
//		//구현할때는 변수명을 아무렇게 사용해도 괜챃다! 그게 그거이니까
//		(1)
		LambdaInter lambdaInter = (number)-> number %10 ==0;
//		(2)
//		LambdaInter lambdaInter = (number)-> {return number %10 ==0;};
//		(3)
//		LambdaInter lambdaInter = number-> number %10 ==0;
//		(4)
//		LambdaInter lambdaInter = number-> {return number %10 ==0;};
		
		boolean result= lambdaInter.checkMultipleOf10(21);
		System.out.println(result);
				
		
		
	}

}
