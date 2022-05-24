
public abstract class BankaHesabi {
	//S�n�f�m�z �zellikleri
	int iban;
	double bakiye;
	
	//S�n�f�m�z�n yap�c� metodu
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
