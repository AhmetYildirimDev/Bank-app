
public class KrediKarti {
		//Sýnýfmýzýn özellikleri
		int kartNumarasi;
		double limit;
		double guncelBorc;
		double kullanýlabilirLimit;
		
		//Sýnýfmýzýn yapýcý metodu
		public KrediKarti(double limit, double guncelBorc) {
			super();
			this.limit = limit;
			this.guncelBorc = guncelBorc;
		}

		@Override
		public String toString() {
			return "BankaHesabi [kartNumarasi=" + kartNumarasi + ", limit=" + limit + ", guncelBorc=" + guncelBorc
					+ ", kullanýlabilirLimit=" + kullanýlabilirLimit + "]";
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

		public double getKullanýlabilirLimit() {
			return kullanýlabilirLimit;
		}

		public void setKullanýlabilirLimit(double kullanýlabilirLimit) {
			this.kullanýlabilirLimit = kullanýlabilirLimit;
		}
		

}
