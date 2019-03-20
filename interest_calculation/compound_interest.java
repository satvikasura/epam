package interest_calculation;

public class compound_interest extends interest {
	public double interest_(){
		return principal*Math.pow((1+rate_of_interest), years)-principal;
	}
}
