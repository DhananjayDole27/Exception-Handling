package exception.handling;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("main--start");
		try
		{
			int a =10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch -- block");
		}
		System.out.println("main -- end");

	}

}
