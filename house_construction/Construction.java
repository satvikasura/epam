package house_construction;

public class Construction {
	final int standard=1200,above_standard=1500,high_standard=1800,high_standard_and_automated=2500;
	boolean automation;
	int required_material;
	double area;
	Construction(){}
	
	Construction(int required_material,double area){
		this.area=area;
		switch(required_material){
			case 1:
				this.required_material=standard;
				break;
			case 2:
				this.required_material=above_standard;
				break;
			case 3:
				this.required_material=high_standard;
				break;
			case 4:
				this.required_material=high_standard_and_automated;
				break;
		}
	}
	
	double getCost(){
		return required_material*area;
	}
}
