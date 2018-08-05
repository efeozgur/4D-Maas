package Kisi;

public class Kisi {
	String adSoyad, tcNo, IbanNo,medeniDurum;
	int cocukSayisi;
	
	public Kisi(String adSoyad, String tcNo, String ibanNo, String medeniDurum, int cocukSayisi) {
		this.adSoyad = adSoyad;
		this.tcNo = tcNo;
		IbanNo = ibanNo;
		this.medeniDurum = medeniDurum;
		this.cocukSayisi = cocukSayisi;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public String getTcNo() {
		return tcNo;
	}

	public String getIbanNo() {
		return IbanNo;
	}

	public String getMedeniDurum() {
		return medeniDurum;
	}

	public int getCocukSayisi() {
		return cocukSayisi;
	}
	
}
