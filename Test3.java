package exception.handling;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("main -- Start");
		try
		{
			System.out.println("try--Start");
			int a= 10/2;
			System.out.println("try -- End");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Catch --Block");
		}
		System.out.println("main -- End");

	}

}
