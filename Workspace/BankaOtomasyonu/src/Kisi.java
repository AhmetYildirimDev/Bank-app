
public abstract class Kisi {
	//S�n�fm�z�n �zellikleri
	String ad,soyad,email;
	int telefonNumarasi;
	
	//S�n�f�m�z�n yap�c� methodu
	public Kisi(String ad, String soyad, String email, int telefonNumarasi) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.email = email;
		this.telefonNumarasi = telefonNumarasi;
	}


	@Override
	public String toString() {
		return "Kisi [ad=" + ad + ", soyad=" + soyad + ", email=" + email + ", telefonNumarasi=" + telefonNumarasi
				+ "]";
	}
	
	
}
