
public class YatirimHesabi extends BankaHesabi {
	String hesaptürü;
	
	public YatirimHesabi(double bakiye) {
		super(bakiye);
	}

	@Override
	public String toString() {
		return "YatirimHesabi [hesaptürü=" + hesaptürü + "]";
	}
	
	public void paraEkle(YatirimHesabi gonderen,YatirimHesabi alici) {
		//hesabýn %20 kadarýný hesaplýyoruz
		double gonderilecek = (gonderen.bakiye)*0.2;
		//aliciya hesapladýðýmýz tutarý ekliyoruz
		alici.setBakiye(alici.getBakiye()+gonderilecek);
		//hesabýmýzdan para cýkýþý olduðu kadarýný bakiyeden düþüyoruz.
		gonderen.setBakiye(gonderen.getBakiye()-gonderilecek);
	
	};
	
	public void paraCek(double miktar) {
		//nakit para çekme iþlemi bakiyeden düþer
		super.bakiye = super.bakiye - miktar;
	}
	
	//@GETTER @SETTER
	public String getHesaptürü() {
		return hesaptürü;
	}

	public void setHesaptürü(String hesaptürü) {
		this.hesaptürü = hesaptürü;
	};
	
	
}
