package exception.handling;

public class Test5 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("try--Start");
			int a= 10/0;
			System.out.println("try -- End");
		}
		finally
		{
			System.out.println("finally --Block");
		}
		System.out.println("program -- End");
	}

}
// Will throw exception ArithmeticException:/by Zero along with output