package Kisi;

public class GenelDegiskenler {
	String daireBaslik,bankaAdi, aitOlduguAy,gerceklestirmeGorevlisi, harcamaYetkilisi, butceYili;

	public GenelDegiskenler(String daireBaslik, String bankaAdi, String aitOlduguAy, String gerceklestirmeGorevlisi,
			String harcamaYetkilisi, String butceYili) {
		this.daireBaslik = daireBaslik;
		this.bankaAdi = bankaAdi;
		this.aitOlduguAy = aitOlduguAy;
		this.gerceklestirmeGorevlisi = gerceklestirmeGorevlisi;
		this.harcamaYetkilisi = harcamaYetkilisi;
		this.butceYili = butceYili;
	}

	public String getDaireBaslik() {
		return daireBaslik;
	}

	public String getBankaAdi() {
		return bankaAdi;
	}

	public String getAitOlduguAy() {
		return aitOlduguAy;
	}

	public String getGerceklestirmeGorevlisi() {
		return gerceklestirmeGorevlisi;
	}

	public String getHarcamaYetkilisi() {
		return harcamaYetkilisi;
	}

	public String getButceYili() {
		return butceYili;
	}

}
