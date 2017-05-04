package java_web_dzsw;

public abstract class Attachment extends Phone {
	Phone x;
	public Attachment(Phone x){
		this.x=x;
		
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return x.cost();
	}
	public String getDescription(){
		return x.getDescription();
	}

}
