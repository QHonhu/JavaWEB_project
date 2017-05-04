package java_web_dzsw;

public class Battery extends Attachment {
	double batteryprice;
	public Battery(double batteryprice,Phone x){
		super(x);
		this.batteryprice=batteryprice;
	}

	public String getDescription(){
		return super.getDescription()+"+µç³Ø";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost() + this.Batteryprice();
	}
	


	public double Batteryprice() {
		// TODO Auto-generated method stub
		return batteryprice;
	}

	
}
