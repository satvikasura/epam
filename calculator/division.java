package calculator;
/**
 * Division of two numbers
 *
 */
public class division {

	private int dividend,divisor;
division(){} //Empty default constructor
	
	division(int dividend, int divisor){
		this.dividend=dividend;
		this.divisor=divisor;
	}
	
	int divide() throws ArithmeticException {
		return dividend/divisor; //If the divisor is zero, it will implicitly raise exception
	}
}
