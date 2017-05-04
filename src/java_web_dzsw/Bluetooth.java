package java_web_dzsw;

public class Bluetooth extends Attachment {
	double blueprice;
	

	public Bluetooth(double blueprice,Phone x) {
		super(x);
		this.blueprice=blueprice;
	}
	@Override
	public String getDescription(){
		return super.getDescription()+"+А¶СА";
	}
	@Override
	public double cost(){
		return super.cost()+this.getBlueprice();
	}
	public double getBlueprice() {
		// TODO Auto-generated method stub
		return blueprice;
	}

}
