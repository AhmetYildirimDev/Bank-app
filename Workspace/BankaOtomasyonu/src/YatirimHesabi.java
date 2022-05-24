
public class YatirimHesabi extends BankaHesabi {
	String hesapt�r�;
	
	public YatirimHesabi(double bakiye) {
		super(bakiye);
	}

	@Override
	public String toString() {
		return "YatirimHesabi [hesapt�r�=" + hesapt�r� + "]";
	}
	
	public void paraEkle(YatirimHesabi gonderen,YatirimHesabi alici) {
		//hesab�n %20 kadar�n� hesapl�yoruz
		double gonderilecek = (gonderen.bakiye)*0.2;
		//aliciya hesaplad���m�z tutar� ekliyoruz
		alici.setBakiye(alici.getBakiye()+gonderilecek);
		//hesab�m�zdan para c�k��� oldu�u kadar�n� bakiyeden d���yoruz.
		gonderen.setBakiye(gonderen.getBakiye()-gonderilecek);
	
	};
	
	public void paraCek(double miktar) {
		//nakit para �ekme i�lemi bakiyeden d��er
		super.bakiye = super.bakiye - miktar;
	}
	
	//@GETTER @SETTER
	public String getHesapt�r�() {
		return hesapt�r�;
	}

	public void setHesapt�r�(String hesapt�r�) {
		this.hesapt�r� = hesapt�r�;
	};
	
	
}
