package calculator;
/*
 * Function to perform addition of two numbers
 */
public class addition {
private int num1,num2;
	
	addition(){} //Empty default constructor
	
	addition(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	int add(){
		return num1+num2;
	}

}