package Exceptions;

public class NullException {

	public static void main(String[] args) {

		String nameString =null;
		try {
			nameString.charAt(0);
		} catch (Exception e) {
			System.out.println("Cant perform Actions on null value");
		}
		System.out.println("hi there");
	}

}
