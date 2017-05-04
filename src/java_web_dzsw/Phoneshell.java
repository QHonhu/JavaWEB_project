package java_web_dzsw;

public class Phoneshell extends Attachment {

double shellprice;
	

	public Phoneshell(double shellprice,Phone x) {
		super(x);
		this.shellprice=shellprice;
	}
	@Override
	public String getDescription(){
		return super.getDescription()+"+ÍâÌ×";
	}
	@Override
	public double cost(){
		return super.cost()+this.getShellprice();
	}
	public double getShellprice() {
		// TODO Auto-generated method stub
		return shellprice;
	}

	
}
