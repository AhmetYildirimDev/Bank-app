
public class VadesizHesap extends BankaHesabi {
	//Sýnýfýmýzýn özellikleri
	String hesaptürü;
	
	//Sýnýfýmýzýn yapýcý metodu
	public VadesizHesap(double bakiye) {
		super(bakiye);
	}

	@Override
	public String toString() {
		return "VadesizHesap [hesaptürü=" + hesaptürü + "]";
	}
	
	public void paraTransferi(VadesizHesap gonderen,VadesizHesap alici) {
		//hesabýn %20 kadarýný hesaplýyoruz
		double gonderilecek = (gonderen.bakiye)*0.2;
		//aliciya hesapladýðýmýz tutarý ekliyoruz
		alici.setBakiye(alici.getBakiye()+gonderilecek);
		//hesabýmýzdan para cýkýþý olduðu kadarýný bakiyeden düþüyoruz.
		gonderen.setBakiye(gonderen.getBakiye()-gonderilecek);
		
	};
	
	public void krediKartiBorcOdeme(KrediKarti krediKart,int miktar) {
			//hesaptan borç silmek için para çýkarma
			super.bakiye = super.bakiye - miktar;
			//kredikartý borcu güncelleme
			double guncelBorc = krediKart.getGuncelBorc()-miktar;
			krediKart.setGuncelBorc(guncelBorc);
	}
	
	//@GETTER @SETTER
	public String getHesaptürü() {
		return hesaptürü;
	}

	public void setHesaptürü(String hesaptürü) {
		this.hesaptürü = hesaptürü;
	};	
	
	
}
