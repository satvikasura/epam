package interest_calculation;
	import java.util.Scanner;

	public class InterestCalculator {


		public static void main(String args[]){
			int option;
			interest interestCalc;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter option:\n 1.Simple Interest\n 2.Compound Interest\n");
			option=sc.nextInt();
			switch(option){
				case 1: 
						interestCalc=new simple_interest();
						getInput(interestCalc,sc);
						System.out.println("Interest: "+interestCalc.interest_());
						break;
				case 2:
						interestCalc=new compound_interest();
						getInput(interestCalc,sc);
						System.out.println("Interest: "+interestCalc.interest_());
						break;
				default:
						System.out.println("Wrong input");
					
			}
			
			sc.close();
		}
		
		static void getInput(interest interestCalc,Scanner sc){
			double principal,rate_of_interest,years;
			System.out.println("Enter principal,rate of interest and number of years");
			principal=sc.nextDouble();
			rate_of_interest=sc.nextDouble();
			years=sc.nextDouble();
			interestCalc.principal=principal;
			interestCalc.rate_of_interest=rate_of_interest;
			interestCalc.years=years;
		}
	}

