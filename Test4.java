package exception.handling;

public class Test4 {

	public static void main(String[] args) {
		try
		{
			String s = args[0];
  			int x = Integer.parseInt(s);
			int a =10/x;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter Input Value");
		}
		catch (NumberFormatException e)
		{
			System.out.println("Enter number");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Enter non Zero Value");
		}
	}

}
