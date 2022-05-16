package exception.handling;

public class Test8 {
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
			x= 30;
			System.out.println("finally -- Block---" + x);
			return x;
		}
	}


	public static void main(String[] args) {
		System.out.println("main -- start");
		 Test8 t = new Test8();
		 int x = t.m1();
		 System.out.println(x);
		
		

	}

}


