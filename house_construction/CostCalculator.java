package house_construction;

	import java.util.Scanner;

	public class CostCalculator {
		public static void main(String args[]){
			Construction construction;
			int material;
			double area;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter area");
			area=sc.nextDouble();
			if(area<=0){
				System.out.println("Area cannot be less than or equal to zero");
				System.exit(0);
			}
			System.out.println("Enter type of material:\n 1.Standard\n 2.Above Standard\n 3.High Standard\n 4.High standard and fully automated");
			material=sc.nextInt();
			if(material>4 || material<1){
				System.out.println("Wrong material chosen");
				System.exit(0);
			}
			construction=new Construction(material,area);
			System.out.println("Construction cost is: "+construction.getCost());
			sc.close();
		}

}
