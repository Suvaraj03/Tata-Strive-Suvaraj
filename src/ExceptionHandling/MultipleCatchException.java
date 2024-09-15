package ExceptionHandling;

public class MultipleCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Outer Try block ");

			try {
				int b = 4 / 0;
			} catch (ArithmeticException e) {
				System.out.println("Inner Try block : Arithmetic Exception :" + e.getMessage());

				int a[] = { 3, 4, 5, 6 };
				System.out.println(a[10]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Outer Try block : Array length is not found :" + e.getMessage());
			}
		} finally {
			System.out.println("Outer Try block");
		}
	}

	private static String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
