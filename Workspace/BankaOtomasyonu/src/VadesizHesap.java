
public class VadesizHesap extends BankaHesabi {
	//S�n�f�m�z�n �zellikleri
	String hesapt�r�;
	
	//S�n�f�m�z�n yap�c� metodu
	public VadesizHesap(double bakiye) {
		super(bakiye);
	}

	@Override
	public String toString() {
		return "VadesizHesap [hesapt�r�=" + hesapt�r� + "]";
	}
	
	public void paraTransferi(VadesizHesap gonderen,VadesizHesap alici) {
		//hesab�n %20 kadar�n� hesapl�yoruz
		double gonderilecek = (gonderen.bakiye)*0.2;
		//aliciya hesaplad���m�z tutar� ekliyoruz
		alici.setBakiye(alici.getBakiye()+gonderilecek);
		//hesab�m�zdan para c�k��� oldu�u kadar�n� bakiyeden d���yoruz.
		gonderen.setBakiye(gonderen.getBakiye()-gonderilecek);
		
	};
	
	public void krediKartiBorcOdeme(KrediKarti krediKart,int miktar) {
			//hesaptan bor� silmek i�in para ��karma
			super.bakiye = super.bakiye - miktar;
			//kredikart� borcu g�ncelleme
			double guncelBorc = krediKart.getGuncelBorc()-miktar;
			krediKart.setGuncelBorc(guncelBorc);
	}
	
	//@GETTER @SETTER
	public String getHesapt�r�() {
		return hesapt�r�;
	}

	public void setHesapt�r�(String hesapt�r�) {
		this.hesapt�r� = hesapt�r�;
	};	
	
	
}
