
public abstract class BankaHesabi {
	//Sınıfımız özellikleri
	int iban;
	double bakiye;
	
	//Sınıfımızın yapıcı metodu
	public BankaHesabi(double bakiye) {
		super();
		this.bakiye = bakiye;
	}


	@Override
	public String toString() {
		return "BankaHesabi [iban=" + iban + ", bakiye=" + bakiye + "]";
	}

	//@GETTER @SETTER
	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public int getIban() {
		return iban;
	}
	public void setIban(int iban) {
		this.iban = iban;
	}	
	
	
	
}
