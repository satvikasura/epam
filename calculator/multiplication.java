package calculator;
/**
 * Multiplication of two numbers
 *
 */

public class multiplication {
private int number1,number2;
	
	multiplication(){} //Empty default constructor
	
	multiplication(int number1, int number2){
		this.number1=number1;
		this.number2=number2;
	}
	
	int multiply(){
		return number1*number2;
	}

}