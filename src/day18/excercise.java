package day18;public class excercise {
	public static void main(String[] args){
		int number = 5;
		System.out.println( "factorial of number is: " + number + " is " + factorial(number));

		// fiboracci

	}

	private static int factorial(int number) {
		if ( number == 0 || number == 1) return number;

		// recusion factorial
		return number * factorial( number -1);
	}
}
