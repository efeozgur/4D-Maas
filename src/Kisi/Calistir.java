package Kisi;

import java.sql.SQLException;
import java.text.DecimalFormat;

import Kesintiler.SgkKesinti;
import Kesintiler.VergiKesinti;
import Sonuc.Sonuc;
import SosyalYardimlar.AylikYardimlar;
import SosyalYardimlar.HesapIslem;
import SosyalYardimlar.OlayaBagliYardimlar;
import SosyalYardimlar.YillikYardimlar;


public class Calistir {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {			
		DecimalFormat dFormat = new DecimalFormat("#.##");
		AylikYardimlar aylik = new AylikYardimlar(2,21);
		OlayaBagliYardimlar olay = new OlayaBagliYardimlar(false, false);
		YillikYardimlar yillik = new YillikYardimlar(false);
		SgkKesinti sgkKesinti = new SgkKesinti(aylik, yillik, olay);		
		VergiKesinti vergiKesinti = new VergiKesinti(aylik, sgkKesinti,15,  AGILERIMIZ.EVLI_ESI_CALISMAYAN_2_COCUKLU);
		HesapIslem hesap = new HesapIslem(aylik, olay, yillik);
		Sonuc sonuc = new Sonuc(sgkKesinti, vergiKesinti, hesap);		
		System.out.println("Hakediþ Toplamý : " + hesap.HakedisToplami());
		System.out.println("Tahakkuk Toplamý : " + dFormat.format(sonuc.Tahakkuk()));
		System.out.println("Kesinti Miktarý : " + dFormat.format(sonuc.KesintiMiktari()));
		System.out.println("Net Ödenen : " + dFormat.format(sonuc.NetOdenen()));
	}
}
