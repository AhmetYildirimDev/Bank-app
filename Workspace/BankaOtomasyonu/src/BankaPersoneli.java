import java.util.ArrayList;

//Kisiler s�n�f�ndan kal�t�m al�yor
public class BankaPersoneli extends Kisi {
	//S�n�f�m�z�n �zellikleri
	int personelID;
	ArrayList<Musteri> musteriler = new ArrayList();
	
	//S�f�n�m�z�n yap�c� methodu
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
