
public class KrediKarti {
		//S�n�fm�z�n �zellikleri
		int kartNumarasi;
		double limit;
		double guncelBorc;
		double kullan�labilirLimit;
		
		//S�n�fm�z�n yap�c� metodu
		public KrediKarti(double limit, double guncelBorc) {
			super();
			this.limit = limit;
			this.guncelBorc = guncelBorc;
		}

		@Override
		public String toString() {
			return "BankaHesabi [kartNumarasi=" + kartNumarasi + ", limit=" + limit + ", guncelBorc=" + guncelBorc
					+ ", kullan�labilirLimit=" + kullan�labilirLimit + "]";
		}

		//@GETTER @SETTER
		public int getKartNumarasi() {
			return kartNumarasi;
		}

		public void setKartNumarasi(int kartNumarasi) {
			this.kartNumarasi = kartNumarasi;
		}

		public double getLimit() {
			return limit;
		}

		public void setLimit(double limit) {
			this.limit = limit;
		}

		public double getGuncelBorc() {
			return guncelBorc;
		}

		public void setGuncelBorc(double guncelBorc) {
			this.guncelBorc = guncelBorc;
		}

		public double getKullan�labilirLimit() {
			return kullan�labilirLimit;
		}

		public void setKullan�labilirLimit(double kullan�labilirLimit) {
			this.kullan�labilirLimit = kullan�labilirLimit;
		}
		

}
