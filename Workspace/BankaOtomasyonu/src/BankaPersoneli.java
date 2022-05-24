import java.util.ArrayList;

//Kisiler sýnýfýndan kalýtým alýyor
public class BankaPersoneli extends Kisi {
	//Sýnýfýmýzýn özellikleri
	int personelID;
	ArrayList<Musteri> musteriler = new ArrayList();
	
	//Sýfýnýmýzýn yapýcý methodu
	public BankaPersoneli(String ad, String soyad, String email,int telefonNumarasi) {
		super(ad, soyad, email, telefonNumarasi);
		
	}
	
	
	@Override
	public String toString() {
		return "BankaPersoneli [personelID=" + personelID + ", musteriler=" + musteriler + "]";
	}

	//@GETTER @SETTER
	public int getPersonelID() {
		return personelID;
	}

	public void setPersonelID(int personelID) {
		this.personelID = personelID;
	}

	
	
}
