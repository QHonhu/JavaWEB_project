package java_web_dzsw;

public class Coolpad extends Phone {
	double originalprice;
	public  Coolpad(double originalprice) {
		this.originalprice=originalprice;
		description="¿áÅÉÊÖ»ú£¨ÉğÊ¿ºÚ£©";
	}

	@Override
	public double cost() {
		
		return originalprice;
	}

}
