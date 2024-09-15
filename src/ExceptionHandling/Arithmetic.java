package ExceptionHandling;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result  = 25/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("catch the Exception :" + e.getMessage());
		}
		finally {
			System.out.println("This block Executed.");
		}

	}

	private boolean getMessage() {
		// TODO Auto-generated method stub
		return false;
	}

}
