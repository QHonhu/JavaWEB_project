package java_web_dzsw;

public class Memorycard extends Attachment {
double cardprice;
	

	public Memorycard(double cardprice,Phone x) {
		super(x);
		this.cardprice=cardprice;
	}
	@Override
	public String getDescription(){
		return super.getDescription()+"+�ڴ濨";
	}
	@Override
	public double cost(){
		return super.cost()+this.getCardprice();
	}
	public double getCardprice() {
		// TODO Auto-generated method stub
		return cardprice;
	}

	

}
