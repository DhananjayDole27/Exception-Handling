package exception.handling;
// using finally block
public class Test6 {
	public int m1()
	{
		int x = 20;
		try
		{
			System.out.println("try -- Block");
			return x;
			
		}
		finally
		{
			System.out.println("finally -- Block");
		}
	}

	public static void main(String[] args) {
		System.out.println("main -- start");
		 Test6 t = new Test6();
		 int x = t.m1();
		 System.out.println(x);
		
	}

}
